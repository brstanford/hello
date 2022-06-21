import java.util.Scanner;

public class ArraysHomework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 20:");
        int n = in.nextInt();

        while(n < 1 || n > 20)
        {
            System.out.println("Please enter a number between 1 and 20:");
            n = in.nextInt();

            if(n > 0 && n < 21)
                break;
        }

        int[] powersArray = new int[n];

        for(int i = 0; i < powersArray.length; i++)
        {
            powersArray[i] = (int)Math.pow(2, i);
            System.out.print(powersArray[i] + " ");
        }
    }
}
