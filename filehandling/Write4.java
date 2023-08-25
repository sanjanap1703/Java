package filehandling;

import java.io.File;
import java.io.FileOutputStream;

//using file output stream
public class Write4 {
    public static void main(String[] args) {
        try {
            File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","fo.txt");
            FileOutputStream fo=new FileOutputStream(f);
            String d="FILE CONTENT WRITTEN USING FILEOUTPUTSTREAM";
            fo.write(d.getBytes());
            System.out.println("file created");
            fo.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
