/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.util.Scanner;
class A
{
   float a;
   Scanner in = new Scanner(System.in);
   void wgt()
   {
   System.out.println("Enter your weight(in kgs): ");
   a=in.nextInt();
   }
}
class B extends A
{
    float b;
    void hgt()
    {
     System.out.println("Enter your weight(in kgs): ");
     b=in.nextInt();   
    }
}
public class Multiple extends B
{
    public static void main(String[] args) 
    {
      
    }
    
}
