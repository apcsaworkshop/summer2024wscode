/*
 * Player Class Definition File
 * July 25, 2024
 * Mrs. Ayodeji 
*/

public class Player
{
	// instance variables
	private String name;
	private int location;

	// Constructors
	public Player()
	{
		name = "Default";
		location = 0;
	}

	public Player(String n, int l)
	{
		name = n;
		location = l;
	}

	// Instance methods
	public int move()
	{
		return 0;
	}

	// Accessor Methods
	public String getName()
	{
		return name;
	}

	public int getLocation()
	{
		return location;
	}

	// Mutator Methods
	public void setName(String n)
	{
		name = n;
	}

	public void setLocation(int i)
	{
		location = i;
	}
	public String toString()
	{
		return name + ": location -" + location;
	}




}
