import java.util.HashMap;
import java.util.Set;

public class Hahing {
    public static void main(String args[]){
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put("India", 150);
        h1.put("China", 100);
        h1.put("US", 10);
        h1.put("Nepal", 56);
        h1.put("Indondesia", 85);
        System.out.println(h1);
        System.out.println(h1.containsKey("india"));
       // System.out.println(h1.remove("China"));
        System.out.println(h1);
        Set<String> s=h1.keySet();
        System.out.println(s);
        for (String k: s) {
            System.out.println("Keys "+k+",value="+h1.get(k));
        }
    }
}
