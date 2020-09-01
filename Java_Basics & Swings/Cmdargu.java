/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT1;
public class Cmdargu {
    public static void main(String[] args) {
   if(args.length!=0)
   {
        for(int i=0;i<args.length;i++)
       System.out.println("Arguments are: "+args[i]+"  ");
    }
   else 
       System.out.println("Not found.");
    }}
 
