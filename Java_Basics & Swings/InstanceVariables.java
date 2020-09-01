/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class InstanceVariables {
    public int k=10;    
    public void m1()
    {
        System.out.println("k=" + k);        
        k*=10;
    }
    public void m2()
    {
        System.out.println("k="+k);        
        k*=10;
    }
    public void m3()
    {
        System.out.println("k="+k);
    }
    public static void main(String[] args)
    {
        InstanceVariables obj = new InstanceVariables();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
