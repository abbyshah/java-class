/**
 * 1.) Three quizzes (10 points each) (25% of grade all together) 
 *      remember to convert quiz scores to percentages before they are averaged in.
 * 2.) one midterm (100 points) (35% of grade)
 * 3.) one final (100 points) (40% of grade)
 * 
 * >=90 -> A
 * =80-90 -> B
 * =70-80 -> C
 * =60-70 -> D
 * <60 -> F
 * 
 * Read in student's scorea and output the student's record which consists of three quiz scores and 
 * two exam scores and overall numeric score for course + letter grade. 
 * 
 * Define class for student record (grade) 
 * instance variables for -> quizzes, midterm, final, overall numeric score (weighted),
 * final letter grade. 
 * 
 * method -> compute overall numeric grade and letter grade 
 * methods -> void methods that set appropriate instance variables. 
 * 
 * make reasonable accessor and mutator methods, equals method, and toString method. 
 * (dont have to use them.) 
 * 
 * Abby
 * 10/31/2015
 */
import java.util.Scanner;
public class Grade
{
    private double quiz1, quiz2, quiz3;
    private double midterm;
    private double finalexam;
    private double gradeNumber;
    private char gradeLetter;
    
    //default constructor
    public Grade()
    {
        quiz1 = 0.0;
        quiz2 = 0.0;
        quiz3 = 0.0;
        midterm = 0.0;
        finalexam = 0.0;
        gradeNumber = 0.0;
        gradeLetter = 'Z';
    }
    
    //void methods that set instance variables
    public void getInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Quiz 1: ");
        quiz1 = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Quiz 2: ");
        quiz2 = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Quiz 3: ");
        quiz3 = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Midterm: ");
        midterm = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Final: ");
        finalexam = keyboard.nextDouble();
    }
    
    
    //compute numeric grade
    public void calculateGradeNumber()
    {
        gradeNumber = ((((quiz1 / 10) + (quiz2 / 10) + (quiz3 / 10)) / 3) * 25) + 
				((midterm / 100) * 35) +
				((finalexam / 100) * 40);
    }
    
    //compute letter grade
    public void calculateGradeLetter()
    {
        this.calculateGradeNumber();
        
        if(gradeNumber >= 90)
            gradeLetter = 'A';
        else if(gradeNumber >= 80)
            gradeLetter = 'B';
        else if(gradeNumber >=70)
            gradeLetter = 'C';
        else if(gradeNumber >=60)
            gradeLetter = 'D';
        else 
            gradeLetter = 'F';
    }
    
    //accessor and mutator methods
    public void setQuizzes(double q1, double q2, double q3)
    {
        quiz1 = q1;
        quiz2 = q2;
        quiz3 = q3;
    }
    
    public void setMidterm(double m1)
    {
        midterm = m1;
    }
    
    public void setFinalexam(double f1)
    {
        finalexam = f1;
    }
    
    public double getQuiz1()
    {
        return quiz1;
    }
    
    public double getQuiz2()
    {
        return quiz2;
    }
    
    public double getQuiz3()
    {
        return quiz3;
    }
    
    public double getMidterm()
    {
        return midterm;
    }
    
    public double getFinalexam()
    {
        return finalexam;
    }
    
    
    public double getGradeNumber()
    {
        this.calculateGradeNumber();
        return gradeNumber;
    }
    
    public char getGradeLetter()
    {
        this.calculateGradeLetter();
        return gradeLetter;
    }
    
    //to string method
    public String toString()
	{
		return ("quiz1: " + quiz1 + "\nquiz2: " + quiz2 + "\nquiz3: " + quiz3 +
			"\nmidterm: " + midterm + "\nfinal exam: " + finalexam +
			"\ngrade number: " + gradeNumber + "\ngrade letter: " + gradeLetter);
	}
	
	//equals method
	public boolean equals(Grade otherStudentRecord)
	{
		return ( (this.quiz1 == otherStudentRecord.quiz1) &&
			(this.quiz2 == otherStudentRecord.quiz2) &&
			(this.quiz3 == otherStudentRecord.quiz3) &&
			(this.midterm == otherStudentRecord.midterm) &&
			(this.finalexam == otherStudentRecord.finalexam) );
	}
}
