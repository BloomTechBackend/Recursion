//Fibonacci Series using Recursion
class FibonacciRecursion
{
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2); //recursion
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n - 1));
    }
}