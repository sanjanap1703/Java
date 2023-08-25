package filehandling;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Emoji {
    public static void main(String[] args) {
       /* OutputStream o=System.out;
        o.write(😇););*///error illegal character
        try
        {
            OutputStreamWriter o=new OutputStreamWriter(System.out);
            o.write("\nHII".toCharArray());
            //System.out.println();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
