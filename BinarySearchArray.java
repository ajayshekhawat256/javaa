import java.util.*;
public class BinarySearchArray {
    public static int Binary_Search_tree(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int arr[]={5,10,25,30,35,40};
        System.out.print(Binary_Search_tree(arr,40));
    }
}
