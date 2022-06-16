import java.util.Scanner;

public class SumUsingLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter a positive number:");
        int number = input.nextInt();


        while(number <= 2)
        {
            System.out.println("Please enter a positive number:");
            number = input.nextInt();

            if(number >= 2)
            {
                break;
            }
        }
        int sum = 0;
        int count = 1;
        while(count <= number)
        {
            if(number % count == 0)
            {
                sum = sum + count;
                count++;
            }
            else {
                count++;
            }
        }

        System.out.printf("The sum of all the factors of %d is %d.", number, sum);

    }
}
