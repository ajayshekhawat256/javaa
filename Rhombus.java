public class Rhombus {
    public static void rhombus_Triangle(int n) {
        int k=n;
        for (int i = 1; i < n; i++) {
            k--;
            for (int j = k; j > 0; j--) {
                System.out.print(" ");
            }
            
            for(int j=1;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        rhombus_Triangle(5);
    }
}
