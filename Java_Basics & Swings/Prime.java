import java.io.*;

public class Prime {
    DataInputStream ip = new DataInputStream(System.in);
    int a;
    
    public void input()throws IOException
    {
        System.out.println("Enter a number: ");
        a = Integer.parseInt(ip.readLine());
    }
    public void prime()
    {
        int f=0;
        for(int i=2; i<a; i++)
        {
            if(a%i==0)
                f=1;
        }
        if(f==0)
            System.out.println(a + " is a prime number");
        else
            System.out.println(a + " is NOT a prime number");
    }
    public static void main(String[] args)throws IOException
    {
        Prime p = new Prime();
        p.input();
        p.prime();
    }
}
