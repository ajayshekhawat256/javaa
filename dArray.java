import java.util.*;

public class dArray {

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int max_key = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max_key) {
                    max_key = matrix[i][j];
                }
            }
        }
        System.out.println(max_key);
        System.out.println();
    }
}
