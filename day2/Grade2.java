/*
 * Grade 2 (repeatedly): adding repetition of Grade.java by asking repeatedly until an invalid score is entered.
 * July 9, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class Grade2
{
   public static void main(String[] args)
   {
      double score = 0;
      while (score >= 0)
      {
         Scanner kbIn = new Scanner(System.in);
         System.out.println("Enter your test score:");
         score = kbIn.nextDouble();
         if (score>100)
         {
            System.out.println("Invalid");
            return;
         }
         if (score >= 70)
         {
            System.out.println("Passed");
         }
         else
         {
            System.out.println("Failed");
         }
         if (score >= 90)
         {
            System.out.println("A");
         }
         else if (score >= 80)
         {
            System.out.println("B");
         }
         else if (score >=70)
         {
            System.out.println("C");
         }
         else 
         {
            System.out.println("F");
         }
      }
   
   }
}
