import java.util.Random;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Please enter a positive integer:");
        int n = in.nextInt();

        while (n <= 0)
        {
            System.out.println("Please enter a positive integer");
            n = in.nextInt();
        }

        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            //arr[i] = (int)(Math.random() * 500);
            arr[i] = (int) (Math.random() * ((500 - 1)) + 1);
        }

        System.out.println("Array on one line:");
        printArray(arr);
        System.out.println("\nMaximum: " + getMax(arr));
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Sum: " + sumValues(arr));
        System.out.printf("Average: %.2f", getAverage(arr));
        System.out.println("\nNumber of integers greater than average: " + greaterThanAverage(arr));
        System.out.println("Number of times subsequent value increases : " + countInc(arr));
        System.out.println("Number of times subsequent value decreases : " + countDec(arr));
        System.out.println("Array with 3 elements per line:");
        printArray3PerLn(arr);
    }

    public static void printArray(int[] arr9)
    {
        for(int i = 0; i < arr9.length; i++)
        {
            System.out.print(arr9[i] + " ");
        }
    }

    public static int getMax(int[] arr2)
    {
        int max = arr2[0];
        for(int i = 1; i < arr2.length; i++)
        {
            if(arr2[i] > max)
            {
                max = arr2[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr3)
    {
        int min = arr3[0];
        for(int i = 0; i < arr3.length; i++)
        {
            if(arr3[i] < min)
            {
                min = arr3[i];
            }
        }
        return min;
    }

    public static int sumValues(int[] arr4)
    {
        int sum = 0;
        for(int i = 0; i < arr4.length; i++)
        {
            sum += arr4[i];
        }
        return sum;
    }

    public static double getAverage(int[] arr5)
    {
        int sum = 0;
        double avg;
        for(int i = 0; i < arr5.length; i++)
        {
            sum = sum + arr5[i];
        }
        avg = (double) sum / arr5.length - 1;
        return avg;
    }

    public static int greaterThanAverage(int[] arr6)
    {
        int sum = 0;
        double avg;
        for(int i = 0; i < arr6.length; i++)
        {
            sum = sum + arr6[i];
        }
        avg = (double) sum / arr6.length - 1;

        int greaterThan = 0;
        for(int i = 0; i < arr6.length; i++)
        {
            if(arr6[i] > avg)
            {
                greaterThan++;
            }
        }
        return greaterThan;
    }

    public static int countInc(int[] arr7)
    {
        int count = 0;
        for(int i = 1; i < arr7.length; i++)
        {
            if (arr7[i] > arr7[i - 1])
            {
                    count++;
            }
        }
        return count;
    }

    public static int countDec(int[] arr8)
    {
        int count = 0;
        for(int i = 1; i < arr8.length; i++)
        {
            if (arr8[i] < arr8[i - 1])
            {
                count++;
            }
        }
        return count;
    }

    public static void printArray3PerLn(int[] arr10)
    {
        for(int i = 0; i < arr10.length; i++)
        {
            if(i % 3 != 0 || i <= 2)
            {
                System.out.print(arr10[i] + " ");
            }
            else
            {
                System.out.println();
                System.out.print(arr10[i] + " ");
            }
        }
    }
}
