import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer n:");
        int number = in.nextInt();
        int sumOfAll = sumOfDigits(Math.abs(number));

        System.out.printf("The sum of all digits of %d is: %d", number, sumOfAll);
        System.out.println();
    }

    private static int sumOfDigits(int a)
    {
        int sum = 0;
        int result;
        while(a != 0)
        {
           result = a % 10;
           sum = sum + result;
           a = a / 10;

        }
        return sum;
    }
}
