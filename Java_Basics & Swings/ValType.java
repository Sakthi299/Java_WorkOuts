public class ValType {
    public String name;
    private static double sal;
    
    public static void main(String[] args)
    {
        sal = 50000;
        ValType obj = new ValType();
        obj.gname("Katy");

        for(int i=1; i<=5;i++)
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Salary = "+sal);
    }
    public void gname(String s)
    {
        name = s;
        System.out.println("Name = "+name);
    }
   
}
