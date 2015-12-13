
/**
 * p. 477 #1
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Payment
{
    private double payment; 
    //default constructor
    public Payment(){
        payment = 0.0; 
    }
    //constructor
    public Payment(double newPayment){
        payment = newPayment; 
    }
    //accessor and mutator
    public void setPayment(double newPayment){
        payment = newPayment;
    }
    public double getPayment(){
        return payment; 
    }
    //paymentDetails
    public String paymentDetails(){
        return("Amount of payment: " + payment); 
    }
}
