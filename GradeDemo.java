/**
 * Write a description of class GradeDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GradeDemo
{
    public static void main(String[] args)
    {
        Grade defaultStudent = new Grade();
        System.out.println("default record: \n" + defaultStudent.toString());
        
        Grade student1 = new Grade();
        
        student1.getInput();
        student1.calculateGradeNumber();
        student1.calculateGradeLetter();
        
        System.out.println("Student 1: " + student1.toString());
    }
    
}