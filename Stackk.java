import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;

public class Stackk {
    public static void main(String[] args){
        LinkedList<Integer> l1=new LinkedList<>();
        l1.addFirst(1);
        l1.addFirst(2);
        System.out.println(l1);;
        l1.addFirst(3);
        l1.addFirst(4);
        System.out.println(l1);
        System.out.println(l1.get(l1.size()-1));

        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);
        for(int i=0;i<a1.size();i++){
            System.out.print(a1.get(i)+" ");7
        }
        System.out.println();





        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
    }
}
