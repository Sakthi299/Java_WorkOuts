/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.util.*;
public class Javat {
    int sum;
void disp(int xyz[])
{
    for(int i:xyz)
    {
       sum= sum+i;
    }
System.out.println("Sum of elements in array: "+sum);
}
    public static void main(String[] args) {
  Scanner in=new Scanner(System.in); int x; 
  System.out.println("Enter no.of elements in array: ");
  x=in.nextInt();
  int arr[]=new int[x];
  System.out.println("Enter values: ");
  for(int i=0;i<x;i++)
  {
      arr[i]=in.nextInt();
  }
      Javat obj=new Javat();
      obj.disp(arr);
    }
    
}
