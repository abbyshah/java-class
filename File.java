
/**
 * derived from document. includes instance variable pathname. 
 * text file should be stored in inherited variable text. 
 * toString should concoctate all text fields. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class File extends Document
{
    private String pathname; 
    //default constructor
    public File(){
        super(); 
        pathname = "none"; 
    }
    //constructor
    public File(String pathname1, String text1){
        super(text1);
        pathname= pathname1; 
    }
    
    public String toString(){
        return("Pathname: " + pathname + "\n" + super.toString());
    }
    //accessor mutator methods
    public String getPathname(){
        return pathname; 
    }
    
    public void setPathname(String newPathname){
        pathname = newPathname; 
    }
}
