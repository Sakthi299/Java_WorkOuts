public class HierarchicalInher {
    public static void main(String[] args)
    {
        cat c = new cat();
        System.out.println();
        dog d = new dog();
    }
}
class pet
{
    pet()
    {
        System.out.print("Pet -> ");
    }
}
class cat extends pet
{
    cat()
    {
        System.out.println("Cat");
    }
}
class dog extends pet
{
    dog()
    {
        System.out.println("Dog");
    }
}
/*
run:
Pet
Cat

Pet
Dog
BUILD SUCCESSFUL (total time: 0 seconds)

*/