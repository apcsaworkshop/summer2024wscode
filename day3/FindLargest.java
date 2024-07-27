/* FindLargest : Create an array of 100 integers 
 *               (randomly assigned between -50 and +50 inclusive).  
 *                Identify the largest value and its index                  in the array.
 * July 24, 2024
 * Mrs. Ayodeji
 */

 public class FindLargest
 {
 	public static void main(String[] args)
 	{
 		int[] myArray = new int[100];














 		// Populate the array with random values between -50 and 50
 		for (int i=0; i < myArray.length; i++)
 		{
 			myArray[i] = (int) (101*Math.random()) - 50;
 		}	
















 		// Find the largest value and where it occurs
 		int maxValue = myArray[0];
 		int maxValueIndex = 0;
 		for (int i=0; i < myArray.length; i++)
 		{
 			if (myArray[i] > maxValue)
 			{
 				maxValue = myArray[i];
 				maxValueIndex = i;
 			}
 		}

 		// Print the results
 		System.out.println("myArray: ");
 		for ( int val : myArray)
 		{
 			System.out.print(val + " ");
 		}
 		//System.out.println(myArray);
 		System.out.println("Max value is " + maxValue + " and occurs at index " + maxValueIndex);


 	}
 }