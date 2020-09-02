public class HybridInher {
    public static void main(String[] args)
    {
        D obj = new D();
        obj.ap();
        obj.bp();
        obj.cp();
    }
}
interface A
{
    void ap();
}
interface B extends A
{
    void bp();
}
interface C extends A
{
    void cp();
}
class D implements B, C
{
    public void ap()
    {
        System.out.println("Interface A");
    }
    public void bp()
    {
        System.out.println("Interface B");
    }
    public void cp()
    {
        System.out.println("Interface C");
    }
}