package section02_structure;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {

        var a = 4;
        var b = 6;

        var temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
