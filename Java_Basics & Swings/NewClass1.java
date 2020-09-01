class first extends Thread
{
    public void run()
    {
        NewClass1.tname();
        for(int i=0; i<3; i++)
        {
            System.out.println("Thread #1");            
        }
    }
}
class second extends Thread
{
    public void run()
    {
        NewClass1.tname();
        for(int i=0; i<3; i++)
        {
            System.out.println("Thread #2");
        }
    }
}
class third extends Thread
{
    public void run()
    {
        NewClass1.tname();
        for(int i=0; i<3; i++)
        {
            System.out.println("Thread #3");
        }
    }
}
public class NewClass1 extends Thread {
    static void tname()
    {
         Thread tt = Thread.currentThread();
         System.out.println("Thread name: " + tt.getName());
    }
    public static void main(String[] args)
    {
        first f = new first();
        second s = new second();
        third t = new third();
        f.setName("First");
        s.setName("Second");
        t.setName("Third");
        f.start();
        s.start();
        t.start();
    }
}
