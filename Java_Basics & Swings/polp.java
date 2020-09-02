/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
class allow
{
    int x=10;
void add()
{
    System.out.println("Base class called.");
    System.out.println("x="+x);
}
}
public class polp extends allow
{
    int y;
    void add()
    {
        System.out.println(super.x);
        super.add();
     System.out.println("Derived called.");
    }
public static void main(String[] args)
{
allow a=new allow();
allow b=a;
polp p;
p=new polp();


b.add();
p.add();
 }
}
