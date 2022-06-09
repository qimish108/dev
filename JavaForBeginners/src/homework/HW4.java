package homework;

public class HW4 {
    public static void print(String text) {
        System.out.println(text);
    }
    public static void printLine(){
        System.out.println("____________");
    }
    static int number = 1;
    public static void task() {
        printLine();
        System.out.println("Задача "+ number);
        number++;
    }
    public static void result(String text) {
        System.out.print(text);
    }
    public static void main(String[] args) {

        //задача 14
        int k = 98;
        int l = 3;
        int m = 45;
        int div = k / l;
        int div2 = k/ m;
        int ostatok2 = k % m;
        int ostatok = k % l;

        //задача 3
        int a = 2;
        int b = 7;
        boolean impersant = (a==a) && (b==b);
        int с = 15;
        int d = 3;
        Boolean he = (15<3);
        Boolean he2 = ("сосна"=="дуб"||"вишня"== "клен");
        boolean he3 = ("сосна"!="дуб");
         Boolean he6 = Boolean.valueOf("Глаза даны, чтобы видеть");
         Boolean he7 = Boolean.valueOf("Под третьим этажом находится второй этаж");


        var b1 = (he6) && (he7);
        var he4 = (6/2 == 3) || (7*5 == 20);



        //задача 2

        //вывод
        task();
        result("Результат деления k на l = ");
        System.out.print(div);
        result(" а остаток от деления  = ");
        //System.out.print(ostatok);
        System.out.println(ostatok);
        printLine();
        result("Результат деления k на m = ");
        System.out.print(div2);
        result(" а остаток от деления  = ");
        System.out.println(ostatok2);
        printLine();
        task();
        System.out.println(impersant);
        System.out.println(he);
        System.out.println(he2);
        System.out.println(he3);
        System.out.println(b1);
        System.out.println(he4);
    }


}
