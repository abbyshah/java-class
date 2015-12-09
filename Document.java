
/**
 * p.477 #2
 * Define a class named document.
 * Create a toString method that returns the text field. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Document
{
    String text;  
    //default constructor
    public Document(){
        text = "Hello."; 
    }
    //constructor
    public Document(String text1){
        text = text1; 
    }
    
   public String toString(){
        return text; // we want it to return the text field 
    }
    
   public void setString(String text2){
        text = text2; 
   }
}
