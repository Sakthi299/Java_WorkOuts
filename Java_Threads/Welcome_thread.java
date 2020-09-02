public class simplethread extends Thread
{
public void run()
{
try
{
System.out.println("Good morning to all...");
Thread.sleep(500);
System.out.println("Pleasant Greetings..");
}
catch(Exception e)
{
System.out.println("Thread interrupted");
}
}
public static void main(String[] args) {
System.out.println("-------------------Single Thread Execution------------------");
simplethread st=new simplethread();
st.start();
}
}
