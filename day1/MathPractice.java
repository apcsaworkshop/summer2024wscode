/*
 * Math Practice: based on inputted integers, the sum, quotient*, sqare root and power operations are performed
 * July 8, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class MathPractice
{
   public static void main(String[] args)
   {
      Scanner kbIn = new Scanner(System.in);
      System.out.println("Enter a whole number:");
      int first = kbIn.nextInt();
      System.out.println("Enter another whole number:");
      int second = kbIn.nextInt();
      System.out.println(first + second);
      System.out.println(first/second);
      System.out.println(Math.sqrt(first));
      System.out.println(Math.pow(first,second));
   
   }
}
