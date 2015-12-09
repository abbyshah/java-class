
/**
 * Write a description of class DocumentDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocumentDemo
{
    public static void main(String[] args)
    { 
        //testing constructors...
        Document doc1 = new Document(); 
        Document doc2 = new Document("This is my document i don't know what to write.");
        
        Email mail1 = new Email();
        Email mail2 = new Email("Adam", "Abby", "Hello!", 
                    "Hey friend! This is adam, hope you have a nice day"); //sender, recipient, title, text
                    
        File file1 = new File();
        File file2 = new File("C:/Adam/Documents", "This is my text!");
        
        System.out.println(doc1.toString());
        System.out.println(doc2.toString());
        System.out.println(mail1.toString());
        System.out.println(mail2.toString());
        System.out.println(file1.toString());
        System.out.println(file2.toString()); 
        
        
        //testing from book code
        if(ContainsKeyword(doc1, "candy"))
            System.out.println("Word contained");
        else
            System.out.println("Word not contained"); 
            
        if(ContainsKeyword(doc2, "my"))
            System.out.println("Word contained");
        else 
            System.out.println("Word not contained"); 
            
        if(ContainsKeyword(mail1, "science"))
            System.out.println("Word Contained");
        else
            System.out.println("Word not contained");
            
        if(ContainsKeyword(mail2, "adam"))
            System.out.println("Word Contained"); 
        else
            System.out.println("Word not contained");
            
        if(ContainsKeyword(file1, "new"))
            System.out.println("Word Contained");
        else
            System.out.println("Word not contained");
            
        if(ContainsKeyword(file2, "adam"))
            System.out.println("Word Contained");
        else
            System.out.println("Word not contained");
    }
    
    public static boolean ContainsKeyword(Document docObject, String keyword){
            if (docObject.toString().indexOf(keyword, 0) >= 0)
                return true;
            return false; 
        }
}
