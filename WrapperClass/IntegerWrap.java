package WrapperClass;

public class IntegerWrap {
    public static void main(String[] args) {
        Integer i=5;
        i=10;
        System.out.println(i.toString());
        System.out.println("Binary String :" + Integer.toBinaryString(i));
        System.out.println("Hex string of 13 :"+Integer.toHexString(13));
        System.out.println("Octal string dof 13 :" +Integer.toOctalString(13));
        int a=Integer.parseInt("1010");
        a+=10;
        System.out.println(a);
        a=Integer.parseUnsignedInt("7894");
        System.out.println(a);
        a=i.byteValue();

    }
}
