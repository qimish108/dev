package section02_structure;

import java.util.Scanner;

public class SimpleCalculatorTor {
    public static void main(String[] args) {
        System.out.println("Enter`a`:");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter`b`:");
        var b = new Scanner(System.in).nextInt();
        var aPlusB = a + b;
        var aMinB = a - b;
        var aMulB = a * b;
        var aDelB = a / b;
        var aModB = a % b;
        System.out.println("a+b=" + aPlusB);
        System.out.println("a-b=" + aMinB);
        System.out.println("a*b=" + aMulB);
        System.out.println("a/b=" + aDelB);
        System.out.println("a%b=" + aModB);

    }
}
