import java.util.Scanner;

/**
 * A class to represent automobiles.
 * 
 * @author Tim Wahls
 * @version 8/31/2005 (updated 1/09/2009)
 */
public final class Car
{
    private String make; // the manufacturer of the Car
    private String model; // i.e. Focus, Silverado, ...
    private String color;
    private int year;
    
    /**
     * Constructor for objects of class Car. 
     */

    public Car()
    {
        make = "Pontiac";
        model = "Grand Prix";
        color = "green";
        year = 2000;
    }
    
    /**
     * initialize a new car to the specified parameters
     * @param make the make of the car
     * @param model the model of the car
     * @param color the color of the car
     * @param year the year of the car
     */
    public Car(String make, String model, String color, int year) {
    	this.make = make;
    	this.model = model;
    	this.color = color;
    	this.year = year;
    }
    
    /** initialize fields of a car via user input */
    public void set() {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the make: ");
    	make = sc.next();
    	System.out.print("Enter the model: ");
    	model = sc.next();
    	System.out.print("Enter the color: ");
    	color = sc.next();
    	System.out.print("Enter the year: ");
    	year = sc.nextInt();
    }

    /**
     * change the make of the Car
     * @param mk the new make of the Car
     */
    public void setMake(String mk) {
        make = mk;
    }
 
    /**
     * change the model of the Car
     * @param mod the new model of the Car
     */
    public void setModel(String mod) {
        model = mod;
    }   
 
    /**
     * change the color of the Car
     * @param col the new color of the Car
     */
    public void setColor(String col) {
        color = col;
    }     
  
    /**
     * change the year of the Car
     * @param yr the new year of the Car
     */
    public void setYear(int yr) {
        year = yr;
    } 
    
    /**
     * @return a string with all info about the car
     */
    public String toString() {
        return "A " + color + " " + year + " " + make +
                            " " + model;
    }    
  
    /**
     * @return the make of the Car
     */
    public String getMake() { 
        return make;
    }
  
    /**
     * @return the model of the Car
     */
    public String getModel() { 
        return model;
    }
  
    /**
     * @return the color of the Car
     */
    public String getColor() { 
        return color;
    }
  
    /**
     * @return the year of the Car
     */
    public int getYear() { 
        return year;
    }
    
    /**
     * @return whether or not two Cars are the same
     */
    /*
    public boolean equals(Car anotherCar) { 
        return make.equals(anotherCar.make) && model.equals(anotherCar.model)
               && color.equals(anotherCar.color) && year == anotherCar.year;
    */
    public boolean equals(Object obj) {
    	if (obj == null) {
    		return false;
    	} else if (obj instanceof Car) {
    		Car other = (Car) obj;
    		return make.equals(other.make) && model.equals(other.model)
     		    && color.equals(other.color) && year == other.year;
    	} else {
    		return false;
    	}
    	
    }
    
    public static void main(String [] args) {
    	Car grandPrix = new Car();
    	Car focus = new Car("Ford", "Focus", "black", 2000);
    	System.out.println(grandPrix);
    	System.out.println(focus);
    	System.out.println(focus.equals(grandPrix));
    	Car aCar = new Car();
    	aCar.set();
    	System.out.println(aCar);
    }
}
