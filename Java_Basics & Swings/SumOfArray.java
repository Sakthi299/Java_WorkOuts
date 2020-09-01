import java.io.*;
public class SumOfArray {
    
    DataInputStream ip = new DataInputStream(System.in);
    
    int ar[] = new int[10];
    int n;
    
    public void input()throws Exception
    {
        System.out.println("Enter array size: ");
        n = Integer.parseInt(ip.readLine());
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
            ar[i]=Integer.parseInt(ip.readLine());
        sum();
    }
    public void sum()
    {
        int s=0;
        for(int i=0; i<n; i++)
            s+=ar[i];
        System.out.println("Sum of elements in the array = "+s);
    }
    public static void main(String args[])throws Exception
    {
        SumOfArray obj = new SumOfArray();
        obj.input();
    }
}
