package section05_cycles;

public class DoWhile {
    public static void main(String[] args) {
        var i = 100;
        do {
            System.out.print(i-- + " ");
        }
        while (i >= 1);
        System.out.println();
    }
}
