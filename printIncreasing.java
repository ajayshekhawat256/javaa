public class printIncreasing {
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n);

    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        System.out.println(n);
       
        //System.out.println(mul);
        int sum=n*factorial(n-1);
        return sum;
    }

    public static int sumofNaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        int sum=n+sumofNaturalNumbers(n-1);
        return sum;
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=fibo(n-1);
        //System.out.println(f1);

        int f2=fibo(n-2);
        //System.out.println("This is f2 "+f2);
        //System.out.println("this is f1+f2 "+f1+f2);
        return f2+f1;
    }
    public static void fibonacciseries(int count){
        int n1=0;
        int n2=1;
        
        if (count > 0) {
            
            int n3 = n1 + n2;
            n2=n3;
            n1=n2;
            System.out.print(" " + n3);
            
            fibonacciseries(count - 1);
        }
    }

    public static void main(String args[]) {
        int n = 5;
        // printIncreasing(n);
        //System.out.println(factorial(5));
        //System.out.println(sumofNaturalNumbers(5));
        System.out.println(fibo(n));
        fibonacciseries(10);
    }
}
