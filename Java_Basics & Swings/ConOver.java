public class ConOver {
    ConOver()
    {
        System.out.println("Default");
    }
    ConOver(int x)
    {
        System.out.println("x = " + x);
    }
    ConOver(int x, double y)
    {
        System.out.println("x = " + x + " y = " + y);
    }
    public static void main(String[] args)
    {
        ConOver o1 = new ConOver();
        ConOver o2 = new ConOver(100);
        ConOver o3 = new ConOver(5, 23.14);
    }
}
