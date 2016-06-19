/** a class to represent cars sold by a car dealership
    @author Tim Wahls
    @version 12/13/2009 */

public abstract class SalableVehicle {
    protected String vin; // vehicle identification number
    protected int mileage; // number of miles on odomoter
    protected int price; // sale price (in $)

    /** initialize a new SalableVehicle with the indicated vin, 
        mileage and price */
    public SalableVehicle(String vin, int mileage, int price) {
        this.vin = vin;
        this.mileage = mileage;
        this.price = price; 
    }

    /** @return the vehicle identification number */
    public String getVin() {
        return vin;
    }

    /** @return the mileage */
    public int getMileage() {
        return mileage;
    }

    /** @return the sale price */
    public int getPrice() {
        return price;
    }

    /** visit the vehicle with the specified visitor */
    public void accept(CarVisitor v) {
       v.visit(this);
    }
 
    /** @return the make and model of the vehicle, for example, 
                "Chevrolet Silverado" or "Ford Focus" */
    public abstract String getMakeAndModel();

    /** @return the color of the vehicle */
    public abstract String getColor();

    /** @return the year of the vehicle */
    public abstract int getYear();

    /** @return all information about the vehicle as a String
                must include the make, model, color, year, vin, 
                                 mileage and price */
    public abstract String toString();
}
