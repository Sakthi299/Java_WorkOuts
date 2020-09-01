import java.util.*;
public class ArrayL {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("D");
        
        int n = al.size();
        for(int i=0; i<n; i++)
            System.out.println(al.get(i));
        System.out.println("Array size: " + n);
    }
}
