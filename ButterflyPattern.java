public class ButterflyPattern {
    public static void Butterfly_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        Butterfly_Pattern(4);
    }
}
