/** A visitor to visit the various kinds of car objects
 *  @author Tim Wahls
 *  @author (YOUR NAME HERE)
 *  @version (PUT DATE HERE) */

public interface CarVisitor {

    public void visit(SalableVehicle v);
    
    public void visit(SalableCar car);
    
    public void visit(SalableSportsCar sportsCar);
    
    public void visit(SalableSUV suv);

}
