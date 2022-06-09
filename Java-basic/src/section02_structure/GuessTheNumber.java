package section02_structure;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Введите  от 1 до 9");
        var user = new Scanner(System.in).nextInt();
        String result = "";
       if(number==user) {
           result = "да";
       }
       else if(number!=user)
           {
           result = "нет";
       }
        System.out.println(result);

    }

}
