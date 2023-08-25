package MultiThreading;
class Ex extends Thread
{
    @Override
    public void run() {
        System.out.println("Run mthod of ex thread "+Thread.currentThread().getName());
        for (int i=0;i<10;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
        System.out.println("last line of thread ex");
    }
}
public class ExtendThread {
    static void print()
    {
        System.out.println(Thread.currentThread());
    }
    public static void main(String[] args) {
        Ex e=new Ex();
        e.start();
        try {
            Thread.sleep(100);
        }
        catch (Exception er){}
        System.out.println("Back to main");
        print();
    }
}
