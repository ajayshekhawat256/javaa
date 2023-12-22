public class Tap_water11 {
    public static int tap_water1(int num[]) {
        int n = num.length;
        int left_max[] = new int[n];
        left_max[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            left_max[i] = Math.max(num[i], left_max[i-1]);
        }
        int right_max[] = new int[n];
        right_max[n - 1] = num[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(num[i], right_max[i + 1]);
        }
        int tap_water = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            tap_water += water_level - num[i];
        }
        return tap_water;
    }
    public static void main(String args[]) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(tap_water1(arr));
    }
}
