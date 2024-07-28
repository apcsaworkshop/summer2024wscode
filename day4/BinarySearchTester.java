public class BinarySearchTester
{
	public static void main(String[] args)
	{
		int l=0;
		
		if (args.length > 0)
		{
			l = args.length;
			int[] arr = new int[l];
			for (int i = 0; i < l; i++)
			{
				arr[i] = Integer.parseInt(args[i]);
			}
			for (int val : arr)
			{
				System.out.print(val + " ");

			}
			System.out.println(" ");
			System.out.println("Search result: " + binarySearch(arr, 0, l, -5));
		}
		else
		{
			 
			int[] arr2 = {-12, -3, 10, 10, 13, 17, 18, 19, 20};
			l = arr2.length;
			for (int val : arr2)
			{
				System.out.print(val + " ");
				
			}
			System.out.println(" ");
			System.out.println("Search result: " + binarySearch(arr2, 0, l, -5));
		}
		
	}

	public static int binarySearch(int[] myArray, int lowPosition, int highPosition, int target)
    {
   		int midPosition;
   		if (lowPosition > highPosition)
   		{
      		return -1;
   		} 
   		else 
   		{
      		midPosition = (lowPosition + highPosition)/2;
      		if (myArray[midPosition] < target)
         	{
         		return binarySearch(myArray, midPosition+1, highPosition, target);
      		}
      		if (myArray[midPosition] > target)
         	{
         		return binarySearch(myArray, lowPosition, midPosition-1, target);
      		}
			return midPosition;
   		}
	}
}