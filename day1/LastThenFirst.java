/*
 * Last Then First Class: prints a name in a specified format (last, then first)
 * July 5, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class LastThenFirst
{
   public static void main(String[] args)
   {
      Scanner kbIn = new Scanner(System.in);
      System.out.println("Enter your first name:");
      String first = kbIn.next();
      System.out.println("Enter your last name");
      String last = kbIn.next();
      System.out.print(last);
      System.out.println(first);
   
   }
}
