class name extends Thread
{
public void run()
{
System.out.println("NAME: "+detail.n);
System.out.println("Roll NO: "+detail.roll);
System.out.println("DEPARTMENT: "+detail.dept);
}
}
class detail extends Thread
{
static String n,dept,coll,town; static int roll;static String ph;
public void run()
{
n="Sakthi";dept="IT";coll="MIT";town="Chennai";roll=6103;ph="9994019326";
}
}
class address extends Thread
{
public void run()
{
System.out.println("COLLEGE: "+detail.coll);
System.out.println("PH.NO: "+detail.ph);
System.out.println("TOWN: "+detail.town);
}
}
public class priorthread
 {
public static void main(String[] args)
{
name obj1=new name();obj1.setPriority(Thread.NORM_PRIORITY);
detail obj2=new detail();obj2.setPriority(Thread.MAX_PRIORITY);
address obj3=new address();obj3.setPriority(Thread.MIN_PRIORITY);
System.out.println("STUDENT DETAIL");
System.out.println("----------------------");
obj1.start(); obj2.start(); obj3.start();
}
}
