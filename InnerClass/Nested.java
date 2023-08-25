package InnerClass;

public class Nested {
    int a=48;
    private  void  v()
    {
        //System.out.println(b);
        System.out.println("outer class private method");
       // show1();
        //show(); cannot call nested class methods
    }
    class  In
    {  int b=96;
        void show()
        {   v();
            System.out.println(a);
            System.out.println("Inner Class Method");
        }
        private  void show1()
        {
            System.out.println("private method of inner class");
        }
    }
    public static void main(String[] args) {
        Nested.In n=new Nested().new In();
        n.show();
    }
}
