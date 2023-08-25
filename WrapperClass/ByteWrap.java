package WrapperClass;
//return NumberFormatException
//short is similar to byte
public class ByteWrap {
    public static void main(String[] args) {
        Byte b=new Byte((byte)10);//if write directly 1 it will get considered as the integer so type casting is necessary
        System.out.println(b);
        Byte n=new Byte("15");//string to byte radix default 10;
        System.out.println(n);
        Byte s=Byte.parseByte("11111",2);//prints 31 because binarye equivalent
        System.out.println(s);
        byte b1=Byte.valueOf(b);
        System.out.println(b1);
        //string to byte parsing
        System.out.println(Byte.parseByte("45"));
        int a=b.intValue();
        System.out.println(a);
        //equals,compareTo, comapre
    }
}
