package Lambda;
interface  A
{

    void show();
}
interface B
{
    void pr(int i);
}
interface C
{
    int add(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        A a = () -> System.out.println("sanjana");
        a.show();
        B b = (i) -> System.out.println(i);
        b.pr(45);
        b = (int i) -> System.out.println(i);
        b.pr(45);
        B c = i -> System.out.println(i);//dont need brackets if there is only one argument
        c.pr(789);
        C c1 = (i, j) -> i + j;
        System.out.println(c1.add(4, 5));
        C c2 = (i, j) -> {
            return i + j;
        };
        System.out.println(c2.add(7, 3));
    }
    }

