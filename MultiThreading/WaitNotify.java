package MultiThreading;

public class WaitNotify extends  Thread {
    int total=0;

    @Override
    public void run() {
      synchronized (this) {
          for (int i = 0; i < 10; i++) {
              total += 100;
          }
          this.notify();
      }

    }

    public static void main(String[] args) {
        WaitNotify t=new WaitNotify();
        t.start();
       /* try {
             t.join();
        }
        catch (Exception e){}*/


        synchronized (t)
        {
           try {
               t.wait();
           }
           catch (Exception e){}
        }
        System.out.println(t.total);

    }
}
