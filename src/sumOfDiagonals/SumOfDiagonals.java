package sumOfDiagonals;

//public class SumOfDiagonals {
//    public static void main(String[] args)
//    {
//
//        String[][] s1 =
//                {{"2", "3", "4"},
//                {"5", "6", "7"},
//                {"8", "9", "10"}};
//
//        String[][] s2 =
//                {{"1", "2", "3"},
//                {"5", "6", "7"},
//                {"9", "10", "11"},
//                {"13", "14", "15"}};
//
//        String[][] s3 =
//                {{"1", "2", "3", "4"},
//                {"5", "6", "7", "8"},
//                {"9", "10", "11", "12"},
//                {"13", "14", "15", "16"}};
//
//        try
//        {
//            sumOfDiagonals(s1);
//            sumOfDiagonals(s2);
//            sumOfDiagonals(s3);
//        }
//        catch(NumberFormatException ex)
//        {
//            System.out.println("Not a valid integer");
//        }
//        catch(IllegalArgumentException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//}
//    public static void sumOfDiagonals(String[][] x)
//    {
//        int sum = 0;
//        if(x.length != x[0].length)
//        {
//            throw new IllegalArgumentException("Array not a square");
//        }
//            for (int i = 0; i < x.length; i++)
//            {
//                for (int y = 0; y < x[i].length - 1; y = x[i].length -1)
//                {
//                    if(Integer.valueOf(x[i][y]) % 1 != 0)
//                    {
//                        throw new NumberFormatException();
//                    }
//
//
//                    sum = sum + Integer.parseInt(x[i][y + i]);
//                }
//            }
//        System.out.println(sum);
//    }
//}
