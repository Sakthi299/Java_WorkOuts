    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package PROJECT1;

import java.io.DataInputStream;
class sak
{
    int a;
}
public class Try
{
   DataInputStream s=new DataInputStream(System.in);
   int l,b,ar;
    String len,brd;
    /*public void input()throws Exception
    {
        len=s.readLine();
        l=Integer.parseInt(len);
        brd=s.readLine();
        b=Integer.parseInt(brd);
    }*/
    public void area()
    {
        ar=l*b;
        System.out.println(ar);
    }
    public static void main(String[] args) throws Exception
    {
        //Try a=new Try();
        Try a;
        a=new Try();
       //a.input();
        a.len=a.s.readLine();
        a.l=Integer.parseInt(a.len);
        a.brd=a.s.readLine();
        a.b=Integer.parseInt(a.brd);
        a.area();
        sak s=new sak();
        sak sk=s;           //alias
        s.a=10;
        System.out.println(sk.a);    
    }
}
 

