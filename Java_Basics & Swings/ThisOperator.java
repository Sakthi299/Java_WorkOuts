public class ThisOperator {
    public static void main(String[] args)
    {
        b obj = new b();
        obj.print();
    }
}
class a
{
    private String x;
    private int y;
    
    a(String x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void print()
    {
        System.out.println("Name: " + x);
        System.out.println("Age: " + y);
    }   
}
class b extends a
{
    b()
    {
        super("Elizabeth", 25);
    }
}
