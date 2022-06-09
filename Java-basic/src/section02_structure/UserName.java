package section02_structure;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        System.out.println("введите свое имя");
        var name = new Scanner(System.in).nextInt();
        var result = "Hello, " + name + "!";
        System.out.println(result);
    }
}
