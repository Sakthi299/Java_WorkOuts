public class interthread implements Runnable{
public void run()
{
int a=20,b=10;
System.out.println("SUM of 2 nos: "+(a+b));
System.out.println("DIFFERNCE of 2 nos: "+(a-b));
System.out.println("PRODUCT of 2 nos: "+(a*b));
System.out.println("QUOTIENT of 2 nos: "+(a/b));
}
public static void main(String[] args) {
System.out.println("-----Thread creation using Runnable------");
interthread it=new interthread();
Thread obj=new Thread(it);
obj.start();
}
}
