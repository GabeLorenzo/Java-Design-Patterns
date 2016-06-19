
public class CountSportsCarVisitor implements CarVisitor {
	private int counter;
	
	public CountSportsCarVisitor() {
		counter = 0;
	}

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
		counter++;
	}

	@Override
	public void visit(SalableSUV suv) {
		// TODO Auto-generated method stub
		
	}

	public int getCounter() {
		return counter;
	}

}
