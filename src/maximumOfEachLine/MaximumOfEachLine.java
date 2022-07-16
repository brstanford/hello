package maximumOfEachLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumOfEachLine {
    public static void main(String[] args) {

        //File f = new File("C:\\Users\\BrandonStanford\\OneDrive - Xpanxion\\Desktop\\notes\\data.txt");
        File f = new File("data.txt");
        try
        {
            Scanner readFile = new Scanner(f);
            while(readFile.hasNext())
            {
                String s = readFile.nextLine();
                String s2 = s.replace(",", " ");
                String[] str = s2.split(" ");

                int max = Integer.parseInt(str[2]);
                for(int i = 3; i < str.length; i++)
                {
                    if(Integer.parseInt(str[i]) > max)
                    {
                        max = Integer.parseInt(str[i]);
                    }
                }
                System.out.printf("%s %s Max: %d\n", str[0], str[1], max);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
}
