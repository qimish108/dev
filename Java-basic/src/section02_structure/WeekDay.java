package section02_structure;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели от 1 до 7");
        var a = new Scanner(System.in).nextInt();
        String result = "";
        if (a == 1) {
            result = "Monday";
        } else if (a == 2) {
            result = "Tuesday";

        } else if (a == 3) {
            result = "Wednesday";

        } else if (a == 4) {
            result = "Thursday";

        } else if (a == 5) {
            result = "Friday";

        } else if (a == 6) {
            result = "Saturday";

        } else if (a == 7) {
            result = "Sunday";

        } else if (a > 7 || a < 1) {
            result = "нет такого дня недели";

        }


        System.out.println(result);
    }
}
