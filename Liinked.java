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
    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkIfPallindrome(){
        if(head==null && head.next==null){
            return true;
        }
        Node miNode=findMidNode(head);
        Node curr=miNode;
        Node prev=null;
        while (curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public void reversee(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static boolean iscycle(){
        Node slow=head;
        Node fast=slow;
        while (fast!=null & fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Liinked l1=new Liinked();
        // l1.addFirst(1);
        // l1.addFirst(2);
        // //l1.addFirst(3);
        // //l1.addLast(4);
        // //l1.addLast(5);
        // l1.addLast(1);
        // l1.addLast(5);
        // l1.printlinkedlist();
        // l1.reversee();
        // l1.printlinkedlist();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(1);
        //head.next.next.next=head;
        System.out.println(iscycle());

        System.out.println(l1.checkIfPallindrome());
    } 
}