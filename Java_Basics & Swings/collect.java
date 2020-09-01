/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.util.*;
public class collect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList al=new ArrayList();
       int x;String str;
       System.out.println("Enter no.of values: ");
       x=in.nextInt();
       for(int i=0;i<x;i++)
       {
           System.out.println("Enter value ");//+ (i+1)+" to add on to ArrayList: ");
            str=in.nextLine();
           al.add(str);
       }
       for(int i=0;i<x; i++)
        {
        System.out.println(al.get(i));
        }
    }}
