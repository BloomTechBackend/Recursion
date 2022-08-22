public class FibonacciLoop
{
    public static void main(String[] args)
    {
        int count = 9, num1 = 0, num2 = 1;
        System.out.print("Number " + count+ " element in Fibonacci Series is:");

        int i = 1;
        while(i < count)
        {
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        System.out.print(num1+" ");
    }
}