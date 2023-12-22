import java.util.Scanner;

public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is a prime number");
        }

        boolean isprime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        if (isprime == true) {
            System.out.println("n is a Prime no.");
        } else {
            System.out.println("It's not a prime number");
        }
    }
}
