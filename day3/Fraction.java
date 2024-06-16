/*
 * Fraction class
 * June 5, 2024
 * Mrs. Ayodeji 
*/

public class Fraction 
{
	// Instance variables
	private int numerator;
	private int denominator;



	// Constructors 
	public Fraction(int num, int denom)
	{
		numerator = num;
		if (denom!=0)
		{
			denominator = denom;
		}
		{
			denominator = denom;
		}
	}

	public Fraction(int num)
	{
		numerator = num;
		denominator = 1;
	}

	// Accessor Methods
	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public String print()
	{
		String result = numerator + "/" + denominator;
		return result;
	}

	// Other methods
	public Fraction multiply(Fraction b)
	{

		int prod_num = numerator * b.getNumerator();
		int prod_denom = denominator * b.getDenominator();
		Fraction prod = new Fraction(prod_num, prod_denom);
		return prod;

	}



}