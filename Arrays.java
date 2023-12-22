import java.util.Scanner;

public class Arrays {
    public static int Largest_Array(int arr[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
        return Largest;
    }

    public static void main(String args[]) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest No. in arrray is"+Largest_Array(arr));

    }
}
