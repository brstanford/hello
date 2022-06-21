import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};
        System.out.println("Before shifting:");
        System.out.println(Arrays.toString(arr1));

        System.out.println("After shifting:");
        for(int i = arr1.length -1; i >= 0; i--)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}
