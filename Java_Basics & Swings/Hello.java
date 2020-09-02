/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT1;

/**
 *
 * @author student
 */
public class Hello {
    public static void main(String[] arr) {
  if (arr.length > 0) 
        { 
            System.out.println("The command line"+ 
                               " arguments are:"); 
            for (String val:arr) 
                System.out.println(val); 
        } 
  else if(arr.length ==0)
            System.out.println("No command line "+ 
                               "arguments found."); 
    }   
}
