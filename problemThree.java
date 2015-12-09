
/**
 * Page 168 -- Programming project 3: Write a program to estimate the adult height of a 
 * child using the formulas 
 * 1.) H(for male child) = ((H(mother) X 13/12) + H(father)/2
 * 2.) H(for female child) = ((H(father) X 12/13) + H(mother)/2
 * Input will be gender of child, height of mother, and height of father. (in feet + inches)
 * Output will be estimated adult height of child. (in feet + inches) 
 * 
 * Use loops to allow user to enter new data until they decide to exit. 
 * 
 * Abby Shah
 * 10/02/2015
 */
import static java.lang.Math.*;
import java.util.Scanner;
public class problemThree
{ 
    public static void main(String[] args)
    {
        String g1 = "Female";
        String g2 = "Male";
        String a1 = "Yes";
        String a2 = "No";
        String answer;
        
        do
        {   System.out.println();
 
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter gender of child: ");
            String gender = keyboard.nextLine();
            System.out.println("Enter height of mother in feet and inches: ");
            int feet_mother = keyboard.nextInt();
            keyboard.next();
            int inches_mother = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter height of father in feet and inches: ");
            int feet_father = keyboard.nextInt();
            keyboard.next();
            int inches_father = keyboard.nextInt();
            keyboard.nextLine();
                
            int height_mother = (feet_mother * 12) + inches_mother; //in inches
            int height_father = (feet_father * 12) + inches_father; //in inches
            

            if (gender.equals(g1)) //female
            {
                double child_height = (((double)height_father * 12 / 13) + height_mother) / 2; //in inches
                int child_height_round = (int)Math.round(child_height); //rounds to nearest integer value
                int feet_child = child_height_round / 12; //calculates feet
                int inches_child = child_height_round % 12; //calculates remaining inches
                System.out.println("Your child will be: " + feet_child + " feet and " + inches_child + " inches tall.");
            }
                
            if (gender.equals(g2)) //male
            {
                double child_height = (((double)height_mother * 13 / 12) + height_father) / 2; //in inches
                int child_height_round = (int)Math.round(child_height); //rounds to nearest integer value
                int feet_child = child_height_round / 12; //calculates feet
                int inches_child = child_height_round % 12; //calculates remaining inches
                System.out.println("Your child will be: " + feet_child + " feet and " + inches_child + " inches tall.");
            }
            
            System.out.println("Would you like to try again? (Yes/No): ");
            answer = keyboard.nextLine();
        }
        while(answer.equals(a1)); //When i type No in the compiler it still does the stuff in the 'do' block. how do i make this stop? 
    }
}
