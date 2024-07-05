/*
 * Fibonacci Tester file to test the fib method that returns the nth Fibonacci method
 * July 11, 2024
 * Mrs. Ayodeji 
*/
public class FibonacciTester
{
 
   public static void main(String args[])
    {
        int n = 9;
        System.out.println(
            n + "th Fibonacci Number: " + fib(n));
    }

    public static int fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
 
    

}
