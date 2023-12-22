public class oddorEvenbit {
    public static void Evenoddusingodd(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }

    }
    public static void main(String args[]){
        int n=6;
        Evenoddusingodd(n);
    }
}
