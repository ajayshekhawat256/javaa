 public class Reverse {
    public static void main(String args[]){
        int num=789;
        while(num>0){
            int n=num%10;
            System.out.print(n); 
            num=num/10;
        }
        System.out.println();
    }
}
