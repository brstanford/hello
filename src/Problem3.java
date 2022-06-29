import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter one integer: ");
        int n = in.nextInt();

        boxWithMinorDiagonal(n);
        rightTriangle(n);
        printNLetter(n);
        fancySquare(n);
        //plusInSquare(n);

    }

    public static void boxWithMinorDiagonal(int n)
    {

        for(int row = 0; row <= n; row++)
        {
            for(int col = 0; col <= n; col++)
            {
                if(col == 0 || col == n || row == 0 || row == n)
                {
                    System.out.print("*");
                }
                else if(row + col == n)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rightTriangle(int n)
    {
        for(int row = 0; row <= n; row++)
        {
            for(int col = 0; col <= n; col++)
            {
                if(col == 0 || row == n|| row == col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printNLetter(int n)
    {
        for(int row = 0; row <= n; row++)
        {
            for(int col = 0; col <= n; col++)
            {
                if(col == 0 || col == n || row == col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fancySquare(int n)
    {
        for(int row = 0; row <= n; row++)
        {
            for(int col = 0; col <= n; col++)
            {
                if(col == 0 && row == 0 || col == n && row == 0 || col == 0 && row == n || col == n && row == n)
                {
                    System.out.print("@");
                }
                else if(col == 0 || row == 0 || col == n || row == n)
                {
                    System.out.print("*");
                }
                else if(row + col == n || row == col)
                {
                    if(row == n / 2 || col == n / 2)
                    {
                        System.out.print("@");
                    }
                        else
                        {
                            System.out.print("+");
                        }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

//    public static void plusInSquare(int n)
//    {
//        for(int row = 1; row <= n; row++)
//        {
//            for(int col = 1; col <= n; col++)
//            {
//                if(col == 1 || col == n || row == 1 || row == n)
//                {
//                    System.out.print("*");
//                }
//                else if()
//                {
//                    System.out.print("+");
//                }
//                else
//                {
//                    System.out.print(".");
//                }
//            }
//            System.out.println();
//        }
//    }
}
