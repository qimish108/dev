package mycod01_1;

public class Task {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        while (x < 4) {
            y = x + y;
            System.out.println(x + y );
            x = x + 1;
        }
    }
}
