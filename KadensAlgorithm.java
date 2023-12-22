public class KadensAlgorithm {
    public static void Kadens_algo(int arr[]) {
        int currentsum = 0;
        int largestsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentsum = currentsum + arr[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            largestsum = Math.max(currentsum, largestsum);
        }
        System.out.println("The maximum sub array sum is: "+largestsum);

    }

    public static void main(String args[]) {
        int num[]={4,2,3,8,-6,-4,9,1,2,1,8};
        Kadens_algo(num);

    }
}
