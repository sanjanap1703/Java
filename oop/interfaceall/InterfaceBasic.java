package oop.interfaceall;
interface  I
{
   /* public I()
    {
        System.out.println("Constructor of I intterface");
    }*///constructor inside interface not allowed
    static void print(){
        System.out.println("static method of interface");
        method();
    }
    private void pri()
    {
        System.out.println("private method");
    }
    default void pri2()
    {
        pri();
    }
    private static void method()
    {
        System.out.println("this is private method");
    }

}
public class InterfaceBasic implements I{
    /*public void pri2()
    {
        this.pri();
    }*/
    public static void main(String[] args) {
        InterfaceBasic o=new InterfaceBasic();
        I.print();
        o.pri2();
    }

}
