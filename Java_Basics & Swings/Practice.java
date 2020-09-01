/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

class Cal
{
    float a,b;
    Cal(float x,float y)
    {
        a=x;
        b=y;
    }
}
public class Practice extends Cal
{   float c;
    Practice(float x,float y)
    {
      super(x,y);
      c=x+y;
      System.out.println("Sum "+c+".");
    }
    public static void main(String[] args) {
      Practice obj=new Practice(8.8f,4f);
      
    }
}
