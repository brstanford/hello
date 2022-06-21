import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;

        System.out.println("Please enter an integer greater than 10:");
        int input = in.nextInt();

        while (input <= 10) {
            System.out.println("Please enter an integer greater than 10:");
            input = in.nextInt();

            if (input > 10) {
                break;
            }
        }

        System.out.println("Before swap:");
        int[] arr = new int[input];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 75);
            System.out.print(arr[i] + " ");
        }
        
        System.out.printf("\nSum of elements at index 2, 5, 7 and 9 is: %d \n", findSum(arr));

        temp = arr[6];
        arr[6] = arr[2];
        arr[2] = temp;

        temp = arr[4];
        arr[4] = arr[7];
        arr[7] = temp;

        System.out.println("After swap:");
        for (int j : arr)
        {
            System.out.print(j + " ");
        }

        System.out.printf("\nSum of elements at index 2, 5, 7 and 9 is: %d\n", findSum(arr));

    }
    public static int findSum(int[] arr2)
    {
        int sum= arr2[2] +arr2[5] + arr2[7] +arr2[9];
        return sum;
    }

}


