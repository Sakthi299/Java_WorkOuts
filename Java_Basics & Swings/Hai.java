/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Hai {
    Hai()
{
    System.out.println("Default");
}
Hai(int x)
{
    this();
    System.out.println("Parameter");
}
Hai(String s)
{
    this(12);
    System.out.println("String");
}
     public static void main(String []args){
    Hai h=new Hai(10);
    Hai hh=new Hai("Vijay");
     }
}
   
    

