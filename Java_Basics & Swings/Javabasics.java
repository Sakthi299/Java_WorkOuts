/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.util.Scanner;
class support 
{
    Scanner in = new Scanner(System.in);
    String str,cpr;
void getin()
{
   System.out.println("Enter first name: ");
   str= in.nextLine(); 
}
}        
public class Javabasics extends support 
{
 void getni()
 {
     System.out.println("Enter last name: ");
     cpr=in.nextLine();
 }
 void disp()
 {
     System.out.println("Your name is "+str+" "+cpr+".");
 }
    public static void main(String[] args) {
    Javabasics jb=new Javabasics();
    jb.getin();
    jb.getni();
    jb.disp();
}
}
