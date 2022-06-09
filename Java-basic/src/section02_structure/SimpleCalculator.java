package section02_structure;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("enter `a`");
        System.out.println("enter `b`");
        var a = Integer.parseInt(new Scanner(System.in).nextLine());
        var b = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}
