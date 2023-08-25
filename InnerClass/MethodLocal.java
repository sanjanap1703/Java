package InnerClass;

public class MethodLocal {
    public static void main(String[] args) {
      int b=45;
        class  Inner
        {
            private int x=500;
            void show()
            {
                System.out.println(x);
                System.out.println(b);
            }
        }
        Inner o=new Inner();
        o.show();
        System.out.println(o.x);
    }
}
