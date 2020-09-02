import java.io.*;

public class Reverse {

    DataInputStream ip = new DataInputStream(System.in);
    int n;
    
    public void input()throws IOException
    {
        System.out.println("Enter a number: ");
        n = Integer.parseInt(ip.readLine());
    }
    public void rev()
    {
        int r=0, a;
        a = n;
        while(a>0)
        {
            r = r*10 + a%10;
            a/=10;
        }
        System.out.println("Reverse of " + n + " is " + r);
    }
    
    public static void main(String[] args)throws IOException
    {
        Reverse obj = new Reverse();
        obj.input();
        obj.rev();
    }
}
