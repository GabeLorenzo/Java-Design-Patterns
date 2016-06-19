/**
 * 
 * Adapter Pattern 
 * @author 
 *
 */
public class SalableCar extends SalableVehicle {
	private Car car;

	public SalableCar(String vin, int mileage, int price, String make,
			String model, String color, int year) {
		super(vin, mileage, price);
		car = new Car(make, model, color, year);

	}

	@Override
	public String getMakeAndModel() {
		String make = car.getMake();
		String model = car.getModel();
		return make + " " + model;
	}

	@Override
	public String getColor() {
		return car.getColor();
	}

	@Override
	public int getYear() {
		return car.getYear();
	}

	@Override
	public String toString() {
		return car.toString();
	}
	

}
