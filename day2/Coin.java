/*
 * Coin class
 * June 25, 2024
 * Mrs. Ayodeji 
*/
public class Coin
{
	// instance variables
	private double value;
	private String name;
	private String metal="silver";

	// Constructor
	public Coin(double val, String n)
	{
		value = Math.abs(val);
		name = n;
	}

	public Coin(double val, String n, String mtl)
	{
		value = Math.abs(val);
		name = n;
		metal = mtl;
	}

	// Methods i.e. Behaviors
	// Accessor Methods
	public double getValue()
	{
		return value;
	}

	public String getName()
	{
		return name;
	}

	public String getMetal()
	{
		return metal;
	}


	// Mutator Methods
	public void setValue(double val)
	{
		value = Math.abs(val);
	}

	public void setName(String n)
	{
		name = n;
	}
}
