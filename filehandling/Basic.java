package filehandling;

import java.io.File;

public class Basic {
    public static void main(String[] args) {
        try {
            File f = new File("file1.txt");
           // boolean b = f.createNewFile();
          /*  if(b)
            System.out.println("File created");*/
            System.out.println("File name :" + f.getName());
            System.out.println("Path: " + f.getPath());
            System.out.println("Absolute path:"
                    + f.getAbsolutePath());
            System.out.println("Parent:" + f.getParent());
            System.out.println("Exists :" + f.exists());

            if (f.exists()) {
                System.out.println("Is writable:"
                        + f.canWrite());
                System.out.println("Is readable " + f.canRead());
                System.out.println("Is a directory: "
                        + f.isDirectory());
                System.out.println("File Size in bytes "
                        + f.length());
            }
        }
        catch (Exception e)
        {
            System.out.println("file not created");
        }
    }
}
