/*
 * Fraction Tester file to test Fraction constructor and methods
 * July 24, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class FractionTester 
{
	public static void main(String[] args)
	{
		Scanner kbIn = new Scanner(System.in);
		System.out.print("Enter a numerator value: ");
		int num = kbIn.nextInt();
		int den = 0;
		
		while (den == 0)
		{
			System.out.print("Enter a non-zero denominator value: ");
			den = kbIn.nextInt();
		}

		// Create a Fraction object
		Fraction f1 = new Fraction(num, den);
		// Create a Fraction object with a whole number i.e. dem=1
		Fraction f2 = new Fraction(num);
		Fraction f3 = new Fraction(7, 2); // f3 = 7/2
		Fraction f4 = new Fraction(-4); // f4 = -4/1
		//Fraction f5 = new Fraction();

		// Print fractions example "3/4" 
		System.out.println( "f1: " + f1.toString());
		System.out.println( "f2: " + f2.toString()); 
		System.out.println( "f3: " + f3.toString());
		System.out.println( "f4: " + f4.toString());


		// Multiply the fractions
		Fraction product = f1.multiply(f3);
		System.out.println("f1*f3: " + product.toString());





	}
}
