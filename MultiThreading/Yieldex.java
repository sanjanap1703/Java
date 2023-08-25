package MultiThreading;

public class Yieldex extends Thread {
    @Override
    public void run() {
        for (int i=0;i<15;i++)
        {   /*t*//*ry {
            Thread.sleep(500);
        }catch (Exception e){}*/
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

    public static void main(String[] args) {
    Yieldex t=new Yieldex();
    t.start();
    for (int i=0;i<15;i++)
    {
        Thread.yield();
        System.out.println(Thread.currentThread().getName());
    }

    }
}
