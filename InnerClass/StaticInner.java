package InnerClass;

public class StaticInner {
   static  int c=15;
    static class In
    {
        int a=34;
        void display()
        {
            System.out.println("static Inner class method");
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
      new StaticInner.In().display();
    }
}
