
public class CarFactory {
	
	public static SalableVehicle getCar(String vin, int mileage, int price, String make,
			String model, String color, int year) {
		return new SalableCar(vin, mileage, price, make, model, color, year);
	}
	
	public static SalableVehicle getSportsCar(String vin, int mileage, int price, String make,
			String model, String color, int year, int engineHorsePower) {
		return new SalableSportsCar(vin, mileage, price, make, model, color, year, engineHorsePower);
	}
	
	public static SalableVehicle getSUV(String vin, int mileage, int price, String make,
			String model, String color, int year, int groundClearance, int maxCargo) {
		return new SalableSUV(vin, mileage, price, make, model, color, year, 
				groundClearance, maxCargo);
	}

}
