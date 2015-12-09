
/**
 * Write a description of class Fraction here.
 * 
 * mutator methods -> allow user to set numerator and denominator
 * method -> display fraction on screen (does not neet to reduce)
 * method -> equals, which takes another fraction input and returns True
 *  if fractions are = and False otherwise. (This method should reduce 
 *  fractions to lowest terms before comparing. 
 *  
 *Embed class in a test program that allows user to create a fraction. 
 *Program should loop until user decides to quit. Inside the loop the 
 *program should allow the user to enter a target fraction into an 
 *anonymous object and learn whether the fractions are identical.
 * 
 * Abby Shah
 * 11/4/2015
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fraction
{
	private int numerator;
	private int denominator;

	//default constructor
	public Fraction()
	{
		numerator = 0;
		denominator = 1; 
	}

	//constructor
	public Fraction(int initialNumerator, int initialDenominator)
	{
		numerator = initialNumerator;

		if (initialDenominator != 0)
			denominator = initialDenominator;
		else
		{
			System.out.println("cannot divide by zero.  Exiting.");
			System.exit(0);
		}
	}

	public void readInput()
	{
	    Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter numerator: ");
		numerator = keyboard.nextInt();
		System.out.println("Enter denominator: ");
		denominator = keyboard.nextInt();
	}

	//set input
	public void set(int newNumerator, int newDenominator)
	{
		numerator = newNumerator;
		denominator = newDenominator;
	}

	public void setNumerator(int newNumerator)
	{
		numerator = newNumerator;
	}

	//set denominator with the 0 case. 
	public void setDenominator(int newDenominator)
	{
		if (newDenominator != 0)
			denominator = newDenominator;
		else
		{
			System.out.println("cannot divide by zero.  Exiting.");
			System.exit(0);
		}
	}

	public String toString()
	{
		return (numerator + "/" + denominator);
	}

	public boolean equals(Fraction otherFraction)
	{
		return ( ((this.numerator / this.lowestCommonDenominator()) == (otherFraction.numerator /
			otherFraction.lowestCommonDenominator())) &&
			((this.denominator / this.lowestCommonDenominator()) == (otherFraction.denominator /
			otherFraction.lowestCommonDenominator())) );
	}

	private int lowestCommonDenominator()
	{
		int lowestCommonDenominator = 1;
		int smaller = 0;

		if (numerator < denominator)
			smaller = numerator;
		else
			smaller = denominator;

		for (int i = 1; i <= smaller; i++)
		{
			if ( (numerator % i == 0) && (denominator % i == 0) )
				lowestCommonDenominator = i;
		}

		return lowestCommonDenominator;
	}
}

    

