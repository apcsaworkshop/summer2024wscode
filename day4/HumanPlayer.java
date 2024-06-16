/*
 * Human Player Class 
 * June 6, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class HumanPlayer extends Player
{
	// instance variables
	
	// Constructors
	public HumanPlayer()
	{
		super();
	}

	public HumanPlayer(String n, int l)
	{
		super(n,l);
	}

	// Instance methods
	public int move()
	{
		Scanner kbIn = new Scanner(System.in);
		System.out.println("Please enter 1,2,3,4 or 5 as a new location: ");
		int new_location = kbIn.nextInt();
		if (new_location <1 && new_location>5)
		{
			System.out.println("invalid location");
		}
		super.setLocation(new_location);
		return new_location;

	}

	public String toString()
	{
		return "(Human Player) " + super.getName() + ": location -" + super.getLocation();
	}




}