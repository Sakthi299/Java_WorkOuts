public class RTPolymorphism {
    public static void main(String[] args)
    {
        account a = new premium();
        a.gift();
    }
}
class account
{
    void gift()
    {
        System.out.println();
        System.out.println("Gift for all accounts");
    }
}
class premium extends account
{
    void gift()
    {
        super.gift();
        System.out.println(" + Special gift for Premium accout");
    }
    
}

