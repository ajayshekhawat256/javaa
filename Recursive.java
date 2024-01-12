public class Recursive {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n+" ");
            return; 
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(1+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int nm1=n*factorial(n-1);
        return nm1;
    }
    public static int sumOfNaturalNumbers(int n){
        if(n==0){
            return 1;
        }
        int sum=n+sumOfNaturalNumbers(n-1);
        return sum;
    }
    public static void main(String args[]){
        int n=10;
        printInc(n);
        System.out.println(factorial(10));
        System.out.println(sumOfNaturalNumbers(10));
    }
}
