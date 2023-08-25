package filehandling;

import java.io.*;

//using bufferwriter
public class Write1 {
    public static void main(String[] args) {
     try {
         File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
         BufferedWriter bw=new BufferedWriter(new FileWriter(f.getAbsoluteFile()));
         bw.append("\n this is appended by write1.java program");
         //bw.close();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }

    }
}
