import java.util.ArrayList;
/* FindLargest : Create an ArrayList of 100 integers 
 *               (randomly assigned between -50 and +50 inclusive).  
 *                Identify the largest value and its index                  in the array.
 * July 24, 2024
 * Mrs. Ayodeji
 */

 public class FindLargestAL
 {
 	public static void main(String[] args)
 	{
 		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
 		// Populate the Array List with random values between -50 and 50
 		for (int i=0; i < 100; i++)
 		{
 			myArrayList.add( (int) (101*Math.random()) - 50);
 		}	

 		// Find the largest value and where it occurs
 		int maxValue = myArrayList.get(0);
 		int maxValueIndex = 0;
 		for (int i=0; i < myArrayList.size(); i++)
 		{
 			if (myArrayList.get(i) > maxValue)
 			{
 				maxValue = myArrayList.get(i);
 				maxValueIndex = i;
 			}
 		}

 		// Print the results
 		System.out.println("Max value is " + maxValue + " and occurs at index " + maxValueIndex);

 	}
 }