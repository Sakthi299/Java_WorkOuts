class shapes
{
    shapes()
    {
        System.out.println("Shape");
    }
}
class rec extends shapes
{
    rec()
    {
        System.out.println("Rectangle");
    }
}
class width extends rec
{
    width()
    {
        System.out.println("Width");
    }
}
public class MultilevelInher {
    public static void main(String[] args)
    {
        width obj = new width();
    }
}
/*
run:
Shape
Rectangle
Width
BUILD SUCCESSFUL (total time: 0 seconds)
*/