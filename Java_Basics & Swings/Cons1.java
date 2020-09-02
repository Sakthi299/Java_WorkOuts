/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Cons1 {
    int a,sum=0;
    int b[]=new int[10];
    Cons1()
    {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter # of nos: ");
     a=in.nextInt();
     for(int i=0;i<a;i++)
     {
     System.out.println("Enter nos: ");
     b[i]=in.nextInt();
     sum+=b[i];
     }

     System.out.println("Sum of numbers: "+sum );
    }     
    public static void main(String[] args) {
    Cons1 call;
    call=new Cons1();
    }    
}
