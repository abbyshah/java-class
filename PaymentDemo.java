
/**
 * Write a description of class PaymentDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaymentDemo
{
    public static void main(String[] args){
    //testing default
    Payment pay1 = new Payment();
    System.out.println(pay1.paymentDetails()); 
    //testing other constructor
    Payment pay2 = new Payment(20.99); 
    System.out.println(pay2.paymentDetails()); 
    
    //testing cash constructors'
    CashPayment cash1 = new CashPayment(); 
    System.out.println(cash1.paymentDetails()); 
    CashPayment cash2 = new CashPayment(44.99); 
    System.out.println(cash2.paymentDetails()); 
    
    //testing card constructors
    CreditCardPayment credit1 = new CreditCardPayment(); 
    System.out.println(credit1.paymentDetails()); 
    CreditCardPayment credit2 = new CreditCardPayment(50.23, "abby shah", "05/99", "2345 3454 2345 2345"); 
    System.out.println(credit2.paymentDetails());     
   }
}
