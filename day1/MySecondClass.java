/*
 * My Second Class: prints out inputted answers
 * July 22, 2024
 * Mrs. Ayodeji 
*/
import java.util.Scanner;

public class MySecondClass
{
   public static void main(String[] args)
   {
      Scanner kbIn = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int age = kbIn.nextInt();
      System.out.println("Enter your weight: ");
      double weight = kbIn.nextDouble();
      System.out.println("Your age is "  + age);
      System.out.println(weight);   
   }
}
