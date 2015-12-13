
/**
 * Write a description of class CashPayment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CashPayment extends Payment
{
    //default constructor
    public CashPayment(){
        super();
    }
    //constructor
    public CashPayment(double newPayment){
        super(newPayment); 
    }
    //redefine...
    public String paymentDetails(){
        return("Cash payment: " + getPayment()); 
    }    
}
