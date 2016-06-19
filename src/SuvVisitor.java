
public class SuvVisitor implements CarVisitor {
	private int numSuv;
	private int cargoTotal;

	@Override
	public void visit(SalableVehicle v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SalableCar car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SalableSportsCar sportsCar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SalableSUV suv) {
		// TODO Auto-generated method stub
		numSuv++;
		cargoTotal += suv.getMaxCargo();
		
	}

	public int getNumSuv() {
		return numSuv;
	}

	public int getCargoTotal() {
		return cargoTotal;
	}


}
