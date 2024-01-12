import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preorderTrees(Node root){
            if(root==null){
                System.out.println("-1");
                return;
            }
            System.out.println(root.data+"");
            preorderTrees(root.left);
            preorderTrees(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                System.out.println("-1");
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //     1
        //    / \
        //   2   3
        //  / \   \
        // 4   5   6
        BinaryTree tree=new BinaryTree(); 
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorderTrees(root);
        System.out.println("this is it");
        tree.inorder(root);
        System.out.println("this is post order");
        tree.postOrder(root);
        System.out.println("this is level order");
        tree.levelOrder(root);
        Scanner sc=new Scanner(System.in);
        int[][] treee=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                treee[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(treee[i][j]+" ");
            }
            System.out.println();
        }
    }
}
