import java.util.*;
public class JHashSet {
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("E");
        hs.add("D");
        hs.add("D");
        
        int n = hs.size();
        Iterator it = hs.iterator();
        
        while(it.hasNext())
        {
            Object x = it.next();
            System.out.println(x);
        }
        System.out.println("Number of elements: " + n);
    }
}
