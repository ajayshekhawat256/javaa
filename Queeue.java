import java.util.*;
import java.util.LinkedList;
public class Queeue {
    public static void main(String args[]){
            LinkedList<Integer> l1=new LinkedList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.addFirst(5);
            System.out.println(l1);
            for(int i=0;i<l1.size();i++) {
                System.out.println(l1.get(i));
                l1.remove();
            }
            Stack<Integer> s1=new Stack<>();
            s1.add(1);
            s1.add(2);
            s1.add(3);
            s1.add(4);
            System.out.println(s1);
            while (!s1.isEmpty()) {
                System.out.println(s1.peek());
                s1.pop();
            }
            Queue<Integer> q1=new LinkedList<>();
            q1.add(1);
            q1.add(2);
            q1.add(3);
            q1.add(4);
            System.out.println(q1);
            while (!q1.isEmpty()) {
                System.out.println(q1.peek());
                q1.remove();
            }
    }
}
