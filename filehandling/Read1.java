package filehandling;
//using bufferReader
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Read1 {
    public static void main(String[] args) {
        /*try {
            File f1=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src","filehandling");
            System.out.println(f1.isDirectory());
            String[]  s=f1.list();
            for (String w: s)
            {
                File f2=new File(w);
                System.out.println("Is directory : "+f2.isDirectory());
                System.out.println(w);
            }


        }
        catch (Exception e)
        {
          e.printStackTrace();
        }*/
            try
            {
                File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
                BufferedReader o=new BufferedReader(new FileReader(f));
                String st;
                while((st=o.readLine())!=null)
                {
                    System.out.println(st);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

    }
}
