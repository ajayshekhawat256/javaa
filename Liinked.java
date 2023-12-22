public class Liinked{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
         newNode.next=head;
         head=newNode;
    }
    public void printlinkedlist(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            newNode=tail;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String args[]){
        Liinked l1=new Liinked();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.printlinkedlist();
    }
}