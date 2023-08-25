package ExceptionHandling;

public class Simple {
    void display() throws NullPointerException
    {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
       /* try
        {   int b=1;
            if(b!=0)throw new ArithmeticException();
            int a=4/0;
        }
        *//*catch (ArithmeticException e)
        {
            System.out.println("b is 1");
        }*//*
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            //e.printStackTrace();
        }
        *//*catch (ArithmeticException e)
        {
            System.out.println("b is 1");//exception already caught
        }*//*
        finally {
            System.out.println("Finally block");
        }
        System.out.println("rest eof the code");*/
        try
        {
            new Simple().display();
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
    }


}
