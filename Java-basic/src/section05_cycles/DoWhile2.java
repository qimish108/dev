package section05_cycles;

public class DoWhile2 {
    public static void main(String[] args) {
        var step = 2;
        var i = 0;

        do {
            System.out.print(i + " ");
            i += step;
        }
        while (i <= 50);
        {
            System.out.println();
        }
    }
}

