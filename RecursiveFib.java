public class RecursiveFib
{
    /**
     * Main Method
     * @param args
     */
    public static void main(String []args)
    {
        System.out.println("The 10th element is " + fibonacci(10));
    }

    /**
     * Method used to recursively call itself and add onto itself until n is 0
     * @param n
     * @return fibonacci method
     */
    public static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(-2);
        }
    }
}