package separateDuplicates;

public class SeparateDuplicates {
    public static void main(String[] args)
    {

      System.out.println(separateDuplicatesChars("Hello"));
      System.out.println(separateDuplicatesChars("Bookkeeper"));
      System.out.println(separateDuplicatesChars("Yellowwood door"));
      System.out.println(separateDuplicatesChars("Chicago Cubs"));


    }

    public static String separateDuplicatesChars(String str)
    {
        String result = "";
        for(int i = 0; i < str.length() -1; i++)
        {
            if(str.charAt(i) == str.charAt(i + 1))
            {
                result += str.charAt(i) + "-";
            }
            else result += str.charAt(i);
        }
        result += str.charAt(str.length()-1);
        return result;
    }
}
