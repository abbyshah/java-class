/**
 * Write a description of class OdometerDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OdometerDemo
{
    public static void main(String[] args)
    {
        Odometer carOne = new Odometer(25000, 35);
        System.out.println("Car 1: " + carOne.toString());
        System.out.println("Gas used: " + carOne.getGasUsed());
        
        carOne.resetOdometer();
        System.out.println("Car 1: " + carOne.toString());
        
        carOne.setEfficiency(40);
        System.out.println("Car 1: " + carOne.toString());
        
        carOne.addMiles(4000);
        System.out.println("Car 1: " + carOne.toString());
        System.out.println("Gas used: " + carOne.getGasUsed());
        
        Odometer carTwo = new Odometer(150000, 25);
        System.out.println("Car 2: " + carTwo.toString());
        System.out.println("Gas used: " + carTwo.getGasUsed());
    
    }
}