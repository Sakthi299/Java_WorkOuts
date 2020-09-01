/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Conschain {
    int i;int f;
    Conschain()
    {
      this(5);
      f=1;
      for(i=1;i<=6;i++)
      {
          f=f*i;
      }
      System.out.println("For 6!: "+f);
    }
    Conschain(int s)
    {
        this(5,6);
        f=1;
        for(i=1;i<=s;i++)
        {
            f=f*i;
        }
         System.out.println("For 5!: "+f);
    }
    Conschain(int a,int b)
    {
        System.out.println("The factorial of two number "+a+" and "+b+" is "+'\n');
    }
    public static void main(String[] args) {
      new Conschain();
    }
    
}
