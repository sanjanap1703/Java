package MultiThreading;
class Table
{
  synchronized   void printTable(int n)//here we have used keyword synchronized to make this method mutually exclusive
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
   }
}
class Thread1 extends Thread
{ Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    @Override
    public void run() {
        t.printTable(5);
    }
}
class Thread2 extends Thread
{ Table t;
    Thread2(Table t)
    {
        this.t=t;
    }
    @Override
    public void run() {
        t.printTable(7);
    }
}
public class Synchornization {
    public static void main(String[] args) {
        Table t=new Table();
        Thread1 t1=new Thread1(t);
        Thread t2=new Thread2(t);
        t2.start();
        t1.start();

    }
}
