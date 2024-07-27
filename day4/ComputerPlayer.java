/*
 * Computer Player Class Definition file 
 * July 25, 2024
 * Mrs. Ayodeji 
*/


public class ComputerPlayer extends Player
{
	// instance variables
	
	// Constructors
	public ComputerPlayer()
	{
		super();
	}

	public ComputerPlayer(String n, int l)
	{
		super(n,l);
	}

	// Instance methods
	public int move()
	{
		int add_to_location = (int) (20*Math.random()+1);
		int new_location = super.getLocation() + add_to_location;
		super.setLocation(new_location);
		return new_location;

	}

	public String toString()
	{
		String result = super.toString();
		return "(Computer Player) " + result;
	}




}
