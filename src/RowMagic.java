public class RowMagic {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter number of rows: ");
//        int row = in.nextInt();
//        System.out.println("Please enter number of columns: ");
//        int col = in.nextInt();
//
//
//        int[][] arr = new int[row][col];
//        Random random = new Random();
//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = 0; j < arr.length; j++)
//            {
//                arr[i][j] = (int)(Math.random() * ((20 - 1)) + 1);
//                System.out.print(arr[i][j] + " ");
//
//            }
//
//        }
//        System.out.println();
//        System.out.println(isRowMagic(arr));


    public static boolean isRowMagic(int[][] arr)
    {
        boolean isEqual = true;
        int [] sum = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                sum[i] += arr[i][j];
            }

            if(sum[i] != sum[0])
            {
                isEqual = false;
            }
        }
        return isEqual;

    }
}

