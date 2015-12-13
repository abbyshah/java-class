
/**
 * Write a description of class CreditCardPayment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditCardPayment extends Payment
{
   private String name; 
   private String date; 
   private String card; 
   
   //constructors...
   public CreditCardPayment(){
       super(); // will set payment to 0.0 
       name = "no name"; 
       date = "0000"; 
       card = "0000000000000000"; 
   }
   
   public CreditCardPayment(double newPayment, String newName, String newDate, String newCard){
       super(newPayment); 
       name = newName; 
       date = newDate; 
       card = newCard; 
   }
   
   public String paymentDetails(){
       return("Card payment of: " + getPayment()
                + "\nName on card: " + name
                + "\nExperation Date: "+ date
                + "\nCard Number: " + card); 
   }
}
