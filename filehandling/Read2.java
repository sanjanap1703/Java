package filehandling;

import java.io.File;
import java.io.FileReader;

//using  FileReader
public class Read2 {
    public static void main(String[] args) {
        try
        {
            File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
            FileReader fr=new FileReader(f);
            int  s;
            while((s= fr.read())!=-1)
            {
                System.out.print((char)s);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
