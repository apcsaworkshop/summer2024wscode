public class SearchTester
{
	public static void main(String[] args)
	{

		if (args.length > 0)
		{
			// Declare a int array the same size as the args array
			int[] int_args = new int[args.length];

			System.out.println("Arguments");
			for (int i=0; i<args.length; i++)
			{
				System.out.print(args[i]);
				// conver tthe string to an int
				int_args[i]= Integer.parseInt(args[i]);
			}
			System.out.println("");
			System.out.println("int array has " + int_args.length + " entries: " + int_args[0]);
			System.out.println("Searching for 6 result: " + binarySearch(int_args,0, int_args.length-1, 6));
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