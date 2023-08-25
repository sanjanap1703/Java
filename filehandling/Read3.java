package filehandling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//Using Scenner
public class Read3 {
    public static void main(String[] args) {
        try
        {
            File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
            Scanner sc=new Scanner(f);
            String s;
            while ((s=sc.nextLine())!=null)
            {
                System.out.println(s);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
