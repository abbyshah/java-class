/**
 * class called Odometer that tracks fuel and milage. 
 * instance variables -> miles driven and fuel efficiency (miles per gallon)
 * mutator method -> reset the odometer to zero
 * mutator method -> set the fuel efficiency 
 * mutator method -> accepts miles driven for a trip and adds it to the odometer's total
 * accessor method -> returns the number of gallons of gasoline that vehicle has consumed since 
 * odometer last reset. 
 * 
 * Abby Shah
 * 10/31/2015
 */
public class Odometer
{
    private double miles; //miles
    private double efficiency; //miles per gallon
    
    public Odometer()
    {
        miles = 0.0;
        efficiency = 0.0;
    }
    
    public Odometer(double miles_driven, double fuel_efficiency)
    {
        miles = miles_driven;
        efficiency = fuel_efficiency;
    }
    
    //mutator method to reset odometer
    public void resetOdometer()
    {
        miles = 0;
    }
    
    //mutator method to set the fuel efficiency
    public void setEfficiency(double fuel_efficiency)
    {
        efficiency = fuel_efficiency;
    }
    
    //mutator method accepts miles driven and adds to odometer
    public void addMiles(double miles_driven)
    {
        miles = miles + miles_driven;
    }
    
    //accessor method that returns # of gallons consumed since last reset
    public double getGasUsed()
    {
        return (miles/efficiency);
    }
    
    public String toString()
    {
        return(miles + " miles at " + efficiency + " miles per gallon.");
    }
}