/*
 * Grade2: Based on inputted grade, various states will display
 * July 23, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class Grade2b
{
   public static void main(String[] args)
   {
      Scanner kbIn = new Scanner(System.in);
      double score = 0;
      while (score >= 0 && score <= 100)
      {
         System.out.println("Enter your test score:");
         score = kbIn.nextDouble();
         
         if (score >= 90)
         {
            System.out.println("Passed: A");
         }
         else if (score >= 80)
         {
            System.out.println("Passed: B");
         }
         else if (score >=70)
         {
            System.out.println("Passed: C");
         }
         else 
         {
            System.out.println("Failed: F");
         }
      }
      System.out.println("Score is invalid.");
   }
}
