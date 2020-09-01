/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */


interface print
{  
    void printout();  
}  
interface show extends print
{  
    void disp();  
}  
class initial implements show{  
    public void printout()
    {
        System.out.println("Printing out");
    }  
    public void disp()
    {
        System.out.println("Displaying");
    }  
} 
public class Interface {
    public static void main(String args[]){  
    initial obj = new initial();  
    obj.printout();  
    obj.disp();  
    }  
}  
  
/*
run:
Printing out
Displaying
BUILD SUCCESSFUL (total time: 0 seconds)

*/
