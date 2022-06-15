import java.util.Scanner;

public class Problem1 {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = input.nextInt();

            System.out.println("Enter b:");
            int b = input.nextInt();

            System.out.println("Enter c:");
            int c = input.nextInt();

            System.out.println("Enter d:");
            int d = input.nextInt();

            //The plus sign outside the quotations add the variables to the plus signs that are inside the variables (which are strings).
            int variable = sum(a, b, c, d);
            System.out.println(a +" + "+ b + " + " + c +" + " + d + " = " + variable);

            int variable2 = multiply(a, b, d);
            System.out.println(a + " * " + b + " * " + d + " = " + variable2);

            double variable3 = divide(b, d);
            System.out.println(b + " / " + d + " = " + variable3);

            int variable4 = subtract(c, b);
            System.out.println(c + " - " + b + " = " + variable4);

        }
        // Each variable needs to be specified within the parenthesis of the method
        public static int sum (int a, int b, int c,int d){
            int sum = a+b+c+d;
            return sum;
        }
        public static int multiply (int a, int b, int d){
            int multiply = a*b*d;
            return multiply;
        }
        //Double is used here to return a number with a decimal. Float can also be used.
        public static double divide(int b, int d){
            double divide = (double) b/d;
            return divide;
        }
        public static int subtract (int c, int b){
            int subtract = c-b;
            return subtract;
        }
    }

