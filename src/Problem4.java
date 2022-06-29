import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a positive integer:");
        int n = in.nextInt();

        while(n < 1)
        {
            System.out.println("Please enter a positive integer:");
            n = in.nextInt();
        }

        int length = String.valueOf(n).length();

        int[] arr = new int[length];
        for(int i = arr.length - 1; n > 0; i--)
        {
            arr[i] = n % 10;
            n = n / 10;
        }

        int sum = getSum(arr);
        while(sum > 9)
        {
            arr = getArray(sum);
            sum = getSum(arr);
        }
        System.out.println("Single digit result: " + sum);
    }

    public static int getSum(int[] arr2)
    {
        int sum = 0;
        for(int i = 0; i < arr2.length; i++)
        {
            sum = sum + arr2[i];
        }
        return sum;
    }

    public static int[] getArray(int sum)
    {
        int length = String.valueOf(sum).length();
        int[] arr = new int[length];
        for(int i = arr.length - 1; sum > 0; i--)
        {
            arr[i] = sum % 10;
            sum = sum / 10;
        }
        return arr;
    }
}
