package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write2 {
    public static void main(String[] args) {
        try {
            File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
            FileWriter fw=new FileWriter(f);
            fw.write("THIS IS FILE WROTE BY FILE");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
