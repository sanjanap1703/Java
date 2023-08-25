package oop.interfaceall.NestedInterface;

interface Outer
{
    void method1();
    interface Inner
    {
        void method2();
    }
}
public class InsideInterface implements Outer.Inner{
    @Override
    public void method2() {
        System.out.println("This is method of Inner interface");
    }

    //@Override
    /*public void method1() {
        System.out.println("This is outer interface method");
    }*/


    public static void main(String[] args) {
        InsideInterface o1=new InsideInterface();
        //o1.method1();
        o1.method2();
    }
}
//in short we just need to implement the method of interface which we are using not inner or outer