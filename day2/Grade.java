/*
 * Grade
 * June 25, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class Grade
{
   public static void main(String[] args)
   {
      Scanner kbIn = new Scanner(System.in);
      System.out.println("Enter your test score:");
      double score = kbIn.nextDouble();
      if (score <0 || score>100)
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
