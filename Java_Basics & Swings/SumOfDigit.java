import java.io.*;

public class SumOfDigit {
    DataInputStream ip = new DataInputStream(System.in);
    int n;
    public void input()throws IOException
    {
        System.out.println("Enter a number: ");
        n = Integer.parseInt(ip.readLine());
    }
    public void digsum()
    {
        int a=n, sum=0;
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        System.out.println("Sum of digits of " + n + " is " +sum);
    }
    public static void main(String[] args)throws IOException
    {
        SumOfDigit o = new SumOfDigit();
        o.input();
        o.digsum();
    }
}
