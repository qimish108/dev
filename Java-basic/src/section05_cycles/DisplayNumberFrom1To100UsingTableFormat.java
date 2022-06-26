package section05_cycles;

public class DisplayNumberFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        var from = 1;
        var to = 52;
        var step = 1;

        for(var i = from;i <= to;i +=step){
            System.out.print(i + "\t");
            if(i%10 ==0){
                System.out.println();
            }
        }
    }
}
