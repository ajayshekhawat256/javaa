import java.util.ArrayList;

public class BinaryTreee {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if (root==null) {
            return 0;
        }
        int lh=count(root.left);
        int rh=count(root.right);
        return lh+rh+1;
    }
    public static int Summ(Node root){
        if(root==null){
            return 0;
        }
        int lhsum=Summ(root.left);
        int rhsum=Summ(root.right);
        return lhsum+rhsum+root.data;
    }
    static class Info{
        int diam;
        int lh;
        Info(int diam,int lh){
            this.diam=diam;
            this.lh=lh;
        }
    }
    public static Info diam(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=diam(root.left);
        Info rightInfo=diam(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.lh+rightInfo.lh+1);
        int ht=Math.max(leftInfo.lh, rightInfo.lh)+1;
        return new Info(diam, ht);
    }
    public static boolean isIdentical(Node node,Node subNode){
        if(node==null && subNode==null){
            return true;
        }
        if(node==null || subNode==null || node.data!=subNode.data){
            return false;
        }
        if(!isIdentical(node.left, subNode.left)){
            return false;
        }
        if(!isIdentical(node.right, subNode.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubTree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
    public static void printKthLevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        printKthLevel(root.left, level+1, k);
        printKthLevel(root.right, level+1, k);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left, n, path);
        boolean foundRight=getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca=path1.get(i-1);
        return lca;
    }
    public static int lcaDis(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDis(root.left, n);
        int rightDist=lcaDis(root.right, n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDis(Node root,int n1,int n2){
        Node lca=lca(root,n1,n2);
        int dist1=lcaDis(root,n1);
        int dist2=lcaDis(root,n2);
        return dist1+dist2;
    }
    public static int KAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=KAncestor(root.left, n, k);
        int rightDist=KAncestor(root.right, n, k);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDist, rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;

    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int lsum=transform(root.left);
        int rsum=transform(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=newleft+lsum+newRight+rsum;
        return data;
    }
    public static void printInOrder(Node root){
        if(root!=null){
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(15);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(Summ(root));
        System.out.println(diam(root).diam);
        printKthLevel(root, 0, 2);
        System.out.println();
        System.out.println(isSubTree(root, subroot));
        int n1=4,n2=7;
        System.out.println(lca(root, n1, n2).data);
        System.out.println(minDis(root, n1,n2));
        System.out.println(KAncestor(root, 5, 3));
        //transform(root);
        System.out.println(root.data);
        printInOrder(root);
        System.out.println();
        System.out.println(transform(root));
                printInOrder(root);

    }
}
