public class FlyodsTriangle {
    public static void Floroid_Triangle(int n) {
        int k = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Floroid_Triangle(5);
    }
}
