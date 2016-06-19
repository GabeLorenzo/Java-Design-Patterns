
public class SalableSUV extends SalableCar {
	private double maxCargo;
	private double groundClearance;

	public SalableSUV(String vin, int mileage, int price, String make, String model, String color, int year,
			double maxCargo, double groundClearance) {
		super(vin, mileage, price, make, model, color, year);
		// TODO Auto-generated constructor stub
		//this.setMaxCargo(maxCargo);
		//this.setGroundClearance(groundClearance);
		this.maxCargo = maxCargo;
		this.groundClearance = groundClearance;
	}

	public double getMaxCargo() {
		return maxCargo;
	}

	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}

	public double getGroundClearance() {
		return groundClearance;
	}

	public void setGroundClearance(double groundClearance) {
		this.groundClearance = groundClearance;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Ground Clearance: " + groundClearance + "Max Cargo: " + maxCargo);
		return builder.toString();
	}
	public void accept(CarVisitor v) {
	    v.visit(this);
	}
	

}
