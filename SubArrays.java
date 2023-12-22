public class SubArrays {
    public static void Sub_Arrays(int aee[]) {
        int sum = 0;
        int largest = 0;
        for (int i = 0; i < aee.length; i++) {
            for (int j = i; j < aee.length; j++) {
                for (int k = i; k <= j; k++) {
                    // System.out.print(aee[k]);
                    sum = sum + aee[k];

                }
                System.out.println(sum);
                // System.out.print(sum);
                if (sum > largest) {
                    largest = sum;
                }
                sum=0;
                System.out.println("this is the max. sum"+largest);
            }

        }
        System.out.println(largest);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        Sub_Arrays(arr);
    }
}
