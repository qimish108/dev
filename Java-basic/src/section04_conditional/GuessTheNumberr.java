package section04_conditional;

import java.util.Random;
import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class GuessTheNumberr {
    public static void main(String[] args) {
        // read source data
        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();


        System.out.println(number == userCase ?
                "Congratulations, you guessed the number!":
                "Sorry, but your number is invalid! Try again later...");


    }
}
