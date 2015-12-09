
/**
 * demo for fraction class!
 */
import java.util.Scanner;
public class FractionDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = null;
        do{
            Fraction firstFraction = new Fraction();
            Fraction secondFraction = new Fraction();
    
            System.out.println("Information for the first fraction: ");
            firstFraction.readInput();
    
            System.out.println("Information for the second fraction: ");
            secondFraction.readInput();
    
            if (firstFraction.equals(secondFraction))
                System.out.println("They are equal fractions.");
            else
                System.out.println("They are not equal fractions.");
                
            System.out.println("Do you want to try again? : ");
            answer = keyboard.next();
        }while(answer.equalsIgnoreCase("yes"));
    }
}