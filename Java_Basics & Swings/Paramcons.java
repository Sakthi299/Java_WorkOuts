/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Paramcons {
    int id;
    String name,dep;
    Paramcons(int id,String name,String dept)
    {
        this.id=id;this.name=name;dep=dept;
    }
    Paramcons(Paramcons x)
    {
        id=x.id;name=x.name+"Namasivayam";dep=x.dep;
    }
    void disp()
    {
        System.out.println("Roll no: "+id+'\n'+"Name: "+name+'\n'+"Department: "+dep+'\n');
    }
    public static void main(String[] args) {
    Paramcons pm=new Paramcons(6103,"Sakthi","InfoTech");
    Paramcons pn=new Paramcons(pm);
    System.out.println("Student details are listed below: "+'\n');
    pm.disp();
    pn.disp();
    }
    
}
