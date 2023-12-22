import javax.swing.plaf.basic.BasicScrollBarUI;

public class Arraysorted {
    public static boolean recursion_Array(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return recursion_Array(arr, i+1);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        //System.out.println("this is before");
        int xnm1=power(x, n-1);
        //System.out.println("this is after");
        //System.out.println(xnm1);
        int xn=x*xnm1;
        return xn;
    }
    public static int SumOfNaturalNumbers(int n){
        if(n>0){
            return n;
        }
        int sum=0;
        //sum=sum+n;
       sum=sum+SumOfNaturalNumbers(n-1);
        return sum;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,8,5,6};
        int i=0;
       // System.out.println(recursion_Array(arr, i));
        System.out.println(power(2, 5));
        System.out.println(SumOfNaturalNumbers(5));
    }
}
