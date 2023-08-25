package MultiThreading;
class Basic2 implements Runnable
{
    @Override
    public void run() {
        Thread.currentThread().setName("Basic 2");
        System.out.println(Thread.currentThread());
    }
}
public class Basic implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Basic Thread");
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(100);
        }
        catch (Exception e){e.printStackTrace();}
        System.out.println("Thread basic restart");

    }

    public static void main(String[] args) {
        Thread t=new Thread(new Basic());
        Thread t2=new Thread((new Basic2()));
        t.start();
        t2.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){e.printStackTrace();}
        System.out.println("Thread Max priority "+Thread.MAX_PRIORITY);
        System.out.println("Thred MIN Priority "+Thread.MIN_PRIORITY);
        System.out.println("Thread Normal Priority "+Thread.NORM_PRIORITY);
        System.out.println("Main thread Priority "+ Thread.currentThread().getPriority());
    }
}
//after parent thread execution child thread completion