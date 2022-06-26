package section05_cycles;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        var from = 0;
        var to = 50;
        var step = 2;
        var i = from;

        while (i <= to) {
            System.out.print(i + " ");
            i += step;
        }
    }
}
