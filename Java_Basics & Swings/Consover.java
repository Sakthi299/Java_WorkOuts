/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
//import java.util.*;
public class Consover {
int i,r,sum=0,n;
String cpstr,instr;
Consover(int x)       //argument is integer
{
    n=x;
    while(n>0)
    {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(x==sum)
    {
        System.out.println("Palindrome number.");
    }
    else
        System.out.println("Not a Palindrome.");
}
    
Consover(String str)  //argument is string
{
    instr=str;
    cpstr="";
    for(i=instr.length()-1;i>=0;i--)
    {
        cpstr+=instr.charAt(i);
    }
    if(str.equals(cpstr))
    {
        System.out.println("Palindrome String");
    }
    else
        System.out.println("Not a Palindrome String.");
}
public static void main(String[] args) {
    System.out.println("To check  number 111 and string \"MALAYALAM\" are palindrome or not: ");
   Consover cn=new Consover(111);
   Consover cm=new Consover("malayalam");
    }
}
