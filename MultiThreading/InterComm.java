package MultiThreading;
//wait and notify
class A
{
    int num;
    void put(int num){
        this.num=num;
    }
    int get(){return  this.num;}
}
class Producer implements Runnable
{A a;
    Producer(A a)
    {
     this.a=a;
     Thread t=new Thread("producer");
     t.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true)
        {
            a.put(i++);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
class Consumer implements Runnable
{A a;
    Consumer(A a)
    {
        this.a=a;
        Thread t=new Thread("producer");
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true)
        {
           a.get();
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}

public class InterComm {
    public static void main(String[] args) {

    }
}
