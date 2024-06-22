/*
 * My Second Class
 * June 24, 2024
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
      System.out.println(age);
      System.out.println(weight);   
   }
}
