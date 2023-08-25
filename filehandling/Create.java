package filehandling;

import java.io.File;

public class Create {
    public static void main(String[] args) {
        try {
            File f=new File("C:\\Users\\HP\\IdeaProjects\\FirstProject\\persistent\\src\\filehandling","new.txt");
            if(f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("not created");
            if (f.exists())
                System.out.println("file exists");
            else
                System.out.println("not exist ");
            System.out.println(f.getAbsolutePath());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
