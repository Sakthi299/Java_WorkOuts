import java.util.*;
public class JHashMap {
    public static void main(String[] args)
    {
        HashMap hm = new HashMap();
        hm.put(1, "A");
        hm.put(100, "Z");
        hm.put(88, "T");
        hm.put(8, "S");
        hm.put(2, "P");
        
        Iterator it = hm.keySet().iterator();
        
        System.out.println("Key\tValue");
        while(it.hasNext())
        {
            Object key = it.next();
            Object val = hm.get(key);
            System.out.print(key);
            System.out.println("\t" + val);
        }
    }
}
