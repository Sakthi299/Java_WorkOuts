public class MutipleInher {
    public static void main(String[] args)
    {
        anna obj = new anna();
    }
}
interface uni 
{
    default void print()
    {
        System.out.println("University");
    }
}
interface country
{
    default void print()
    {
        System.out.println("Country");
    }
}
class anna implements uni, country
{
    anna()
    {
        print();
    }
    public void print()
    {
        uni.super.print();
        country.super.print();
    }
}

/*
run:
University
Country
BUILD SUCCESSFUL (total time: 0 seconds)
*/