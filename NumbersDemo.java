
/**
 * Write a description of class NumberOrderDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumbersDemo
{
   public static void main(String[] args){
       Numbers test1 = new Numbers(); 
       System.out.println(test1.getNumberUsed()); //should be 0
       
       int[] myArray = {17, 23, 2, 5, 3, 4, 2, 34, 6, 45, 3, 4, 2};
       Numbers test2 = new Numbers(myArray, myArray.length); 
       System.out.println("Input Array: ");
       test2. displayInputArray(); 
       System.out.println("Number Used: " + test2.getNumberUsed()); 
       //System.out.println("Smallest to largest: "); 
       test2.sort(); 
       //test2.displayInputArray(); 
       //System.out.println("Distincts only: ");
       test2.getDistincts(); 
       //test2.displayDistinctsArray(); 
       //System.out.println("Delete repeats: ");
       test2.deleteRepeats();
       //test2.displayInputArray(); 
       System.out.println("Display chart: ");
       test2.displayChart(); 
    }
}
