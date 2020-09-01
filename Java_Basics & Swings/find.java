/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT1;

import java.util.Scanner;
public class find {
 int arr[]=new int[10];
       int sum=0,n;
      public void sum()
      {
          for(int i=0;i<n;i++)
          {
              sum+=arr[i];
          }
System.out.println("Sum of "+n+" numbers is "+sum+".");      
      }
    public static void main(String[] args) {
    find r=new find();
        Scanner in=new Scanner(System.in);
System.out.println("Enter no.of elements: ");  
r.n=in.nextInt();
        for(int i=0;i<r.n;i++)
        {
        r.arr[i]=in.nextInt();
        }
        r.sum();
    }
    
}
