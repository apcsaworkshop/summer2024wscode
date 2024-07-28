/*
 * Computer Player Class Definition file 
 * July 11, 2024
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
		setLocation(super.getLocation() + add_to_location);
		return super.getLocation();

	}

	public String toString()
	{
		// return "(Computer Player) " + super.getName() + ": location -" + super.getLocation();
		return "(ComputerPlayer) " + super.toString();
	}




}
