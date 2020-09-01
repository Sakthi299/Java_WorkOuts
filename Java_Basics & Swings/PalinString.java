/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT1;
import java.util.Scanner;
public class PalinString {
   int i;String instr,cpstr;
      public void check()
      {
          cpstr="";
      for(i=instr.length()-1;i>=0;i--)
      {
          cpstr+=instr.charAt(i);
      }
         
      if(instr.equals(cpstr))    
       System.out.println("It is a Palindrome string ");    
      else    
       System.out.println("It is not a palindrome string");  
      }
    public static void main(String[] args) {
    PalinString palin=new PalinString();
        Scanner in=new Scanner(System.in);
        palin.instr=in.nextLine();
        palin.check();
    }
    
}
