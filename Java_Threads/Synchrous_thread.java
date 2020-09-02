class varr
{
static int a=30,b=5;
}
class adds extends Thread
{
public void run()
{
try{
syncthread.Tname();
System.out.println("Sum of 30 and 5: "+(varr.a+varr.b));
}
catch(Exception e)
{
System.out.println("Thread interrupted...");
}
}
}
class subs extends Thread
{
public void run()
{
try{
syncthread.Tname();
System.out.println("Difference of 30 and 5: "+(varr.a-varr.b));
}
catch(Exception e)
{
System.out.println("Thread interrupted...");
}
}
}
class muls extends Thread
{
public void run()
{
try{
syncthread.Tname();
System.out.println("Product of 30 and 5:"+(varr.a*varr.b));
}
catch(Exception e)
{
System.out.println("Thread interrupted...");
}   }  }
public class syncthread {
static void Tname(){
Thread t=Thread.currentThread();
String name=t.getName();
System.out.println("Thread Name: " +name);
}
public static void main(String[] args) {
adds obj1=new adds();
subs obj2=new subs();
muls obj3=new muls();
obj1.setName("ADDITION"); obj1.start();
obj2.setName("SUBTRACTION"); obj2.start();
obj3.setName("MULTIPLY"); obj3.start();     } }
