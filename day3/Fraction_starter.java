/*
 * Fraction class defition file started: Implement the constructor and methods
 * July 24, 2024
 * Mrs. Ayodeji 
*/

public class Fraction 
{
	// Instance variables




	// Constructors 
	public Fraction(int num, int denom)
	{
		// Implement Constructor with two integer parameters
	}

	public Fraction(int num)
	{
		// Implement Constructor with only one integer parameter. Hint: Denominator should be set to 1
	}

	// Accessor Methods
	public int getNumerator()
	{
		// Implement method to return expected result
	}

	public int getDenominator()
	{
		// Implement method to return expected result
	}

	public String toString()
	{
		// Implement method to return expected result
	}

	// Other methods
	public Fraction multiply(Fraction otherFraction)
	{
		// Implement method to return expected result
		// Hint 1: Multiplying fractions involves multiplying the numerators to get the new numerator and the same with the denominators
		// Hint 2: The returned object should be a Fraction 
		int numeratorvalue = numerator * otherFraction.getNumerator();
		int denominatorvalue = denominator * otherFraction.getDenominator();
		return new Fraction(  numeratorvalue, denominatorvalue);



		
	}



}
