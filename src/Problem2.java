import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer x:");
        int input = in.nextInt();

        for(int i = 1; i <= input; i++)
        {
            if(i % 3 == 0 && i % 2 != 0)
            {
                System.out.printf("%d is a multiple of 3",i);
                System.out.println();
            }
        }
    }
}