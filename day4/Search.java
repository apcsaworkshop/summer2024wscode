/*
 * Search file to test the submission of args when running the file
 * July 11, 2024
 * Mrs. Ayodeji 
*/
public class Search
{
   public static void main(String[] args)
   {
      int[] arr = new int[1000];
      for (int i = 0; i <arr.length; i++)
      {
         arr[i] = (int) (30*Math.random());
      }
   
      int loc = -1;
      loc = binarySearch(arr, 10, 50, 15);
      if (loc > 0)
      {
         System.out.println("The location of 15 in the array is: " + loc);
      }
      else
      {
         System.out.println("The array does not have 15 in it.");
      }
   }

   public static int binarySearch(int[] myArray, int lowPosition, int highPosition, int target)
   {
      int midPosition;
      int location = -1;
      while (lowPosition <= highPosition)
      {
         midPosition = (highPosition + lowPosition) / 2;
         if (myArray[midPosition] < target) 
         {
            lowPosition = midPosition + 1;
         } 
         else if (myArray[midPosition] > target) 
         {
            highPosition = midPosition - 1;
         } 
         else 
         {
            location = midPosition;
            break;
         }
      }
      return location;
   }
}
