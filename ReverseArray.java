public class ReverseArray {
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
        public static void reverse1(int arr[]){
            int start=0;
            int end=arr.length-1;
            while (start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        public static void reverse2(int arr[]){
            int start=0;
            int end=arr.length;
            while (start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    public static void main(String args[]){
        int numbers[]={4,5,6,8,9,6,5,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        reverse1(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

