import java.util.ArrayList;

public class StackB {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int data=list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        System.out.println(s.peek());
        s.push(2);
        s.push(3);
        System.out.println(s.list);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}