
/**
 * derived from Document. 
 * include instance variables for sender, recipient and title. 
 * include appropriate accessor and mutator methods. body of email stored in inherited "text" variable
 * redifine toString to put together all text fields. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Email extends Document
{
    private String sender; 
    private String recipient; 
    private String title; 
    
    //default constructor
    public Email(){
        super();
        sender = "John Smith"; 
        recipient = "you"; 
        title = "no title"; 
    }
    //constructor
    public Email(String sender1, String recipient1, String title1, String emailBody){
        super(emailBody);
        sender = sender1; 
        recipient = recipient1; 
        title = title1; 
    }
    
    public String toString(){
        return("Sender: " + sender + "\nRecipient: " + recipient
                + "\nTitle: " + title + "\n" + super.toString()); 
    }
    
    //accessor and mutator methods
    public String getSend(){
        return sender; 
    }
    
    public String getRecip(){
        return recipient; 
    }
    
    public String getTitle(){
        return title; 
    }
    
    public void setSend(String newSender){
        sender = newSender;
    }
    
    public void setRecipient(String newRecip){
        recipient = newRecip; 
    }
    
    public void setTitle(String newTitle){
        title = newTitle; 
    }
}
