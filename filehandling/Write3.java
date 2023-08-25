package filehandling;

import java.io.File;
import java.io.FileWriter;

public class Write3 {
    public static void main(String[] args) {
        try {
            File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
            FileWriter fw=new FileWriter(f);
            fw.write("HIII THIS IS SANJANA BIPIN PAWAR");
            System.out.println("wriiten on file");
            fw.append("appended content");
            fw.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
