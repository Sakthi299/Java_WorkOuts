/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT1;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Fact {
 public int n,c,f=1;
public void f(int n)
     {
     
    if (n < 0)
      System.out.println("Number should be non-negative.");
    else
    {
      for (c = 1; c <= n; c++)
        f = f*c;

      System.out.println("Factorial of "+n+" is = "+f);
    }    
         
     }
    
    public static void main(String[] args) {
     int n;
    Fact a=new Fact();
    System.out.println("Enter an number: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    a.f(n);
    }
    
}
