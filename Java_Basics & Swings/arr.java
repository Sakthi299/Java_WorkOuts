/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.util.*;
public class arr {
    void disp(char a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
              System.out.print("*"+" ");  
            }
           System.out.println();
        }
    }
    public static void main(String[] args)
    {
     arr obj=new arr();
     int r;
  Scanner in =new Scanner(System.in);
     System.out.println("No.of lines to be displayed: ");
     r=in.nextInt();
     char a[][]=new char[r][];
     for(int i=0,k=1;i<r;i++,k++)
     {
         a[i]=new char[k];
     }
    obj.disp(a);
    }
}
