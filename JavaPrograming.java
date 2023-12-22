import java.util.Scanner;

import javax.swing.text.Style;

public class JavaPrograming {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is again me");
        System.out.println("This is another system.out.println");
        int number = sc.nextInt();
        String s1 = ((number % 4) == 0) ? "even" : "odd";
        System.out.println(s1);
        int marks = sc.nextInt();
        String markss = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(markss);

    }
}