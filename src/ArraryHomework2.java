import java.util.Scanner;

public class ArraryHomework2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a positive:");
        int input1 = in.nextInt();

        while(input1 <= 0)
        {
            System.out.println("Please enter a number between 1 and 20:");
            input1 = in.nextInt();

            if(input1 > 0)
                break;
        }

        System.out.printf("Please enter %d integers:" + "\n", input1);
        int[] arr = new int[input1];
        int sum = 0;
        double average = 0;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
            average = (double) sum / arr.length;
        }


        System.out.println("\n" + "Maximum value is: " + maxValue(arr));
        System.out.println("Minimum value is: " + minValue(arr));
        System.out.println("Average: " + average);


        System.out.println("Elements greater than average: ");
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] > average)
                System.out.print(arr[i] + " ");

        }

            System.out.println("\n" + "Elements greater than: " + arr[arr.length -1]);
            for(int i = 0; i < arr.length; i++)
            {
                if (arr[i] > arr[arr.length - 1])
                    System.out.print(arr[i] + " ");
            }

            System.out.println("\n" + "Elements in reverse order: ");
            for(int i = arr.length - 1; i >= 0; i--)
            {
                System.out.print(arr[i] + " ");
            }

        }

    public static int maxValue(int[] arr2)
    {
        int maxNumber = arr2[0];
        for(int i = 0; i < arr2.length; i++)
        {
            if(arr2[i] > maxNumber)
            {
                maxNumber = arr2[i];
            }

        }
        return maxNumber;
    }

    public static int minValue(int[] arr3)
    {
        int minNumber = arr3[0];
        for(int i = 0; i < arr3.length; i++)
        {
            if(arr3[i] < minNumber)
            {
                minNumber = arr3[i];
            }
        }
        return minNumber;
    }

}

