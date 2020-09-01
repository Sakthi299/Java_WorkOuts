import java.io.*;

public class Factorial { 
    
    DataInputStream ip = new DataInputStream(System.in);
    int a;
    
    public void getInput()throws IOException
    {
        System.out.println("Enter a number: ");
        a = Integer.parseInt(ip.readLine());
    }
    public void fac()
    {
        int f=1;
        for(int i=1; i<=a; i++)
        {
            f*=i;
        }
        System.out.println("Factorial of " + a + " is " + f);
    }
    public static void main(String[] args) throws IOException
    {
        Factorial f = new Factorial();
        f.getInput();
        f.fac();
    }
}
