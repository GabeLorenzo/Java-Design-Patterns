import java.util.Scanner;

/**
 *
 */
public class SalableSportsCar extends SalableCar
{
	private int engineHorsePower;

	public SalableSportsCar(String vin, int mileage, int price, String make, String model, String color, 
			int year, int engineHorsePower) {
		super(vin, mileage, price, make, model, color, year);
		// TODO Auto-generated constructor stub
		//this.setEngineHorsePower(engineHorsePower);
		this.engineHorsePower = engineHorsePower;
	}

	public int getEngineHorsePower() {
		return engineHorsePower;
	}

	public void setEngineHorsePower(int engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" " + "With Engine Horse Power: " + engineHorsePower);
		return builder.toString();
	}
	
	public void accept(CarVisitor v) {
	    v.visit(this);
	}
	

}

