package reverse;

public class Reverse {
        public static void main(String[] args)
        {
                System.out.println(isExactReverse("ba", "a"));
                System.out.println(isExactReverse("desserts", "stressed"));
                System.out.println(isExactReverse("apple", "apple"));
                System.out.println(isExactReverse("regal", "lager"));
                System.out.println(isExactReverse("war", "raw"));
                System.out.println(isExactReverse("pal", "slap"));
        }
        public static boolean isExactReverse(String x, String y)
        {
                if(x.length() != y.length())
                {return false;}

                boolean result = true;
                int xIndex = 0;
                for(int i = y.length() - 1; i >= 0; i--)
                {
                        char yValue = y.charAt(i);
                        char xValue = x.charAt(xIndex);
                        if(xValue == yValue)
                        {
                                xIndex++;
                        }
                        else
                        {
                                result = false;
                                break;
                        }
                }
                return result;
        }
}
