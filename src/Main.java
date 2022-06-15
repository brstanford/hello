// import scanner imports the Scanner class so that we can get information from the user.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declares variables to store user input.
        double num1, num2, num3;

        // Prints instruction to user and receives input to store in num1 variable
        System.out.println("Please enter x:");
        num1 = input.nextInt();

        System.out.println("Please enter y:");
        num2 = input.nextInt();

        System.out.println("Please enter z:");
        num3 = input.nextInt();

        /* Checks to see if numbers are in ascending or descending order. When ran, system produces "Increasing" when
        numbers are ascending. */
        if(num1 < num2 && num2 < num3)
        {
            System.out.println("Increasing");
        }
        // Else-if continues the if statement and checks to see if decreasing and prints "Decreasing" if true.
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println("Decreasing");
        }
        // Else closes out the if statement and prints "Neither" if first two statements are false.
        else
        {
            System.out.println("Neither");
        }
    }
}
