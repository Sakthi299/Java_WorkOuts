/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.util.*;
public class Twod {   
    Scanner in=new Scanner(System.in);
void get(int arr[][],int brr[][],int x,int y,int p,int q)
{
System.out.println("Enter elements of 1st array: ");
for(int i=0;i<x;i++)
    for(int j=0;j<y;j++)
{
arr[i][j]=in.nextInt();
}
System.out.println("Enter elements of 2nd array: ");
for(int i=0;i<p;i++)
{   
    for(int j=0;j<q;j++)
{
brr[i][j]=in.nextInt();
}}
}
void calc(int arr[][],int brr[][],int x,int y,int u,int z)
{
       int[][] sol=new int[x][z];
    if(y==u)
    {
    for(int i=0;i<x;i++)
      { for(int j=0;j<z;j++)
          {  sol[i][j]=0;
            for(int k=0;k<y;k++)
             {
               sol[i][j]+=(arr[i][k]*brr[k][j]);
             }}}
    for(int i=0;i<x;i++)
    {
        System.out.printf("\n");
        for(int j=0;j<z;j++)
        {
    System.out.printf("%d\t",sol[i][j]); 
        }}
    }
    else
      System.out.println("Matrix Multiplication can't be computed.");
    }
public static void main(String[] args) 
{
    int x1,y1,x2,y2;
    Scanner in=new Scanner(System.in);
System.out.println("Enter no.of rows and columns in Matrix 1: ");
x1=in.nextInt();
y1=in.nextInt();
int arr[][]=new int[x1][y1];      
System.out.println("Enter no.of rows and columns in Matrix 2: ");
x2=in.nextInt();
y2=in.nextInt();
int brr[][]=new int[x2][y2];          
Twod obj=new Twod();
obj.get(arr,brr,x1,y1,x2,y2);
obj.calc(arr,brr,x1,y1,x2,y2);
}}