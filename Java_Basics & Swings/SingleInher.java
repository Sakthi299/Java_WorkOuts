public class SingleInher {
    public static void main(String[] args)
    {
        rectangle obj = new rectangle();
        obj.rprint();
        obj.sprint();
    }
}
class shape
{
    void sprint()
    {
        System.out.println("This is shape");
    }
}
class rectangle extends shape
{
    void rprint()
    {
        System.out.println("This is rectangle");
    }
}

/*
run:
This is shape
This is rectangle
BUILD SUCCESSFUL (total time: 0 seconds)
*/