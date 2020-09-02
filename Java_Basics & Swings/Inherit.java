/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.util.Scanner;
interface squ
{
float a=5;
void cal();
}
interface rect
{
float b=10;
void ar();
}
class triangle implements squ,rect
{
   public void cal()
    {
        System.out.println("Length is 5 for Square");
        System.out.println("Area of Square: "+(a*a));
    }
    public void ar()
    {
        System.out.println("Length is 5 & Breadth is 10 for Rectangle");
        System.out.println("Area of Rectangle: "+(a*b));
    }
    void tri()
    {
        System.out.println("Height is 10 & Breadth is 5 for Triangle");
        System.out.println("Area of Triangle: "+(0.5*a*b));
    }
}
public class Inherit {
    public static void main(String[] args) {
      triangle obj=new triangle();
      squ s=obj;
      rect r=new triangle();
      s.cal();
      r.ar();
      obj.tri();
    }  
}
