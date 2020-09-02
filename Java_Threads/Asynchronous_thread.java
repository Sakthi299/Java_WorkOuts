class aa extends Thread
{
public void run()
{
asyncthread.Tname();
try{
for(int i=0;i<2;i++)
{
Thread.sleep(1000);
System.out.println("class a called out...");
}}
catch(Exception e)
{
System.out.println("Thread interrupted...");
}
}
}
class s extends Thread
{
public void run()
{
asyncthread.Tname();
try{
for(int i=0;i<2;i++)
{
Thread.sleep(300);
System.out.println("class s called out...");
}}
catch(Exception e)
{
System.out.println("Thread interrupted...");
}
}
}
class m extends Thread
{
public void run()
{
asyncthread.Tname();
try{
for(int i=0;i<2;i++)
{
Thread.sleep(500);
System.out.println("class m called out...");
}}
catch(Exception e)
{
System.out.println("Thread interrupted...");
}
}
}
public class asyncthread {

static void Tname(){
Thread t=Thread.currentThread();
String name=t.getName();
System.out.println("Thread Name: " +name);
}
public static void main(String[] args) {
System.out.println("-----Multithreading in asynchronous way-----");
aa o1=new aa();
s o2=new s();
m o3=new m();
o1.setName("CLASS ONE");
o2.setName("CLASS TWO");
o3.setName("CLASS THREE");
o1.start(); o2.start(); o3.start();
}
}
