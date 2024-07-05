/*
 * Player Tester file that tests the constructor and methods of various Player objects along with Subclasses
 * July 11, 2024
 * Mrs. Ayodeji 
*/
import java.util.ArrayList;
public class PlayerTester
{
 
   public static void main(String args[])
    {

        ArrayList<Player> players = new ArrayList<Player>();
        // Add Players
        players.add(new HumanPlayer());
        players.add(new HumanPlayer("Jack", 3));
        players.add(new ComputerPlayer("Charles", 4));
        players.add(new ComputerPlayer("Christine", 3));

        // Print out players information
        for (Player player: players)
        {
            System.out.println(player.toString());
            player.move();
            System.out.print("After running move method - ");
            System.out.println(player.toString());
        }


    }

    
 
    

}
