package PROJECT1;

import java.util.Scanner;
public class checkprime {
    Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        int t;
        checkprime a=new checkprime();
	boolean isPrime=true;
	
	System.out.println("Enter any number: ");
	int num=a.in.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           t=num%i;
	   if(t==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
    }
    
}
