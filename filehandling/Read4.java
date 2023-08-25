package filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;

//read file as string
public class Read4 {
    public static void main(String[] args) {
       try {
           String s=new String(Files.readAllBytes(Paths.get("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling\\new.txt")));
           System.out.println(s);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
