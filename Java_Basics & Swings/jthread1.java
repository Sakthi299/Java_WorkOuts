import java.lang.System.*;
class A extends Thread
{
    public synchronized void run()
    {
        try
        {
            for(int i=0; i<3 ; i++)
            {
                
                System.out.println("This is Thread A");
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
             System.out.println("Thread A interrupted");
        }
    }
}
class B extends Thread
{
    public synchronized void run()
    {
        try
        {
            for(int i=0; i<3 ; i++)
            {
                
                System.out.println("This is Thread B");
                Thread.sleep(400);
            }
        }
        catch(Exception e)
        {
             System.out.println("Thread B interrupted");
        }
    }
}
class C extends Thread
{
    public synchronized void run()
    {
        try
        {
            for(int i=0; i<3 ; i++)
            {
                
                System.out.println("This is Thread C");
                Thread.sleep(200);
            }
        }
        catch(Exception e)
        {
             System.out.println("Thread C interrupted");
        }
    }
}
public class jthread1 {
    public static void main(String[] args) throws InterruptedException
    {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        //a.join();
        b.start();
        //b.join();
        c.start();
        //c.join();
    }
}
