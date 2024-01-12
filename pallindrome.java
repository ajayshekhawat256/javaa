import java.util.LinkedList;;
public class pallindrome {
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
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            newNode=tail;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public boolean checkIfPallindrome(){
        if(head==null && head.next==null){
            return true;
        }
        Node midNode=findMidNode(head);
        Node curr=midNode;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    // public Node mergeSort(){
    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     Node mid=getMid(head);
    //     Node rightHead=mid.next;
    //     mid.next=null;
    //     Node newLeft=mergeSort(head);
    //     Node newRight=mergeSort(rightHead);
    //     return merge(newLeft,newRight);
    // }

    
    public static void main(String args[]){
        pallindrome l1=new pallindrome();
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(l1.isCycle()); 
        removeCycle();
        System.out.println(l1.isCycle());
        l1.printLinkedList();
        LinkedList<Integer> ll=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        LinkedList<Integer> l3=new LinkedList<>();
        l3.addFirst(5);
        l3.addFirst(6);
        l3.addFirst(7);
        l3.addFirst(8);
        l3.addLast(9);
        System.out.println(l3);

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll);
        


        // l1.addFirst(1);
        // l1.addFirst(2);
        // l1.addFirst(1);
        // l1.addFirst(1);
        // System.out.println(l1.checkIfPallindrome());

    }
}
