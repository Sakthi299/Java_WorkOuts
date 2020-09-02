import java.util.*;
public class JTreeSet {
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("N");
        ts.add("C");
       // ts.add("A");
        ts.add("E");
        ts.add("B");
        
        Iterator it = ts.iterator();
        while(it.hasNext())
        {
            Object x = it.next();
            System.out.println(x);
        }
         System.out.println("Size: " + ts.size());    
    }
}
