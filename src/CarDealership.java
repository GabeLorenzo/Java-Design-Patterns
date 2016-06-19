import java.util.Scanner;
import java.util.ArrayList;

/**
 * A class to represent a car dealership.
 * 
 * @author Tim Wahls
 * @version 1/09/2009 (modified 12/14/2009)
 */

public class CarDealership {
	private ArrayList<SalableVehicle> carLot;  // inventory
	private String name; // name of the dealership
	
	private int counter;

	/** initialize a default car dealership */
	public CarDealership() {
		carLot = new ArrayList<SalableVehicle>();
		name = null;
	}

	/** initialize a dealership with the specified name
	 * 
	 * @param name the name of the dealership
	 */
	public CarDealership(String name) {
		carLot = new ArrayList<SalableVehicle>();
		this.name = name;
	}

	/** @return the name of the dealership */
	public String getName() {
		return name;
	}

	/** change the name of the dealership
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** add the car to the lot 
	 * @param c the car to add
	 */
	public void addCar(SalableVehicle c) {
		carLot.add(c);
	}

	/** print all cars on the lot */
	public void showCars() {
		System.out.println(name + " has in stock TODAY at low low prices:");
		for (SalableVehicle c : carLot) {
			System.out.println(c);
		}
	}

        /** return the car with the specified VIN
            @throws NoSuchCarException if no car with that VIN is 
                    in inventory */
        public SalableVehicle findCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    return c;
                }
	    }
            throw NoSuchCarException.instance("Error: no car with specified VIN");
        }

        /** sell the car with the specified VIN (remove it from inventory)
            @throws NoSuchCarException if no car with that VIN is 
                    in inventory */
        public void sellCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    carLot.remove(c);
                    return;
                }
	    }
            throw NoSuchCarException.instance("Error: no car with specified VIN");
        }
        
    	public int countSportsCars() {
    		CountSportsCarVisitor cpcv = new CountSportsCarVisitor();
    		
    		for (SalableVehicle c : carLot) {
    			c.accept(cpcv);
    		}
    		return cpcv.getCounter();
    	}
    	
    	public double averageCargoCapacity() {
    		double cargoTotal = 0;
    		SuvVisitor suv = new SuvVisitor();
    		
    		for (SalableVehicle v : carLot) {
    			v.accept(suv);
    		}
    		double avg = suv.getCargoTotal() / suv.getNumSuv();
    		return avg;
    	}

	public static void main(String argv[]) throws NoSuchCarException {
		CarDealership cd = new CarDealership();
		cd.setName("Gabe's Dealership");
		
		// Adapter Patern
		SalableCar honda = new SalableCar("A123", 60, 10, "Honda", 
				"Civic", "Red", 2006);
		cd.addCar(honda);

		SalableCar audi = new SalableCar("T1000", 70, 10, "Audi", "R8",
				"Black", 2010);
		cd.addCar(audi);

		SalableCar bmw = new SalableCar("F4DFA", 80, 12, "BMW", "i8",
				"Silver", 2016);
		cd.addCar(bmw);
		
		// Factory Pattern
		CarFactory carFactory = new CarFactory();
		SalableVehicle sportsCar = carFactory.getSportsCar("AFDs3", 60, 10000, "Bugatti", "Veyron", "Green", 2015, 70);
		cd.addCar(sportsCar);
		SalableVehicle SUV = carFactory.getSUV("SFDJ4", 50, 30000, "Range", "Rover", "Indigo", 2014, 10, 20);
		cd.addCar(SUV);
		
		cd.showCars();
		
		// Vistor Pattern
		System.out.println("Number of Sports Cars: " + cd.countSportsCars());
		System.out.println("Average Cargo Capacity for SUVS: " + cd.averageCargoCapacity());

		// Trigger a No Such Car Exception
		cd.findCar("ZF64SDF");
		
	}
}
