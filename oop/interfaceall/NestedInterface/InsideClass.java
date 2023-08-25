package oop.interfaceall.NestedInterface;
class  Sup
{
    protected interface  Supp
    {
        void method2();
    }
}
public class InsideClass extends Sup {
    protected interface P
    {
        void method1();
    }

    public static void main(String[] args) {
        P o=new P() {
            @Override
            public void method1() {
                System.out.println("hey this is method overriden of nested class inside anonoums interface");
            }
        };
        o.method1();
        Supp p=new Supp() {
            @Override
            public void method2() {
                System.out.println("this is the method of parent classs nested interface");
            }
        };
        p.method2();
        C3 c=new C3();
        c.method1();
    }
}
class C3 implements InsideClass.P
{
    @Override
    public void method1() {
        System.out.println("Method 1 is overriden in c3");
    }
}