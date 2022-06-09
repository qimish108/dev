package lessons;

public class Lesson3 {

//    static int a;
//    static Integer A;
//    static double d;
//    static Double D;
//    static String S;

    public static void main(String[] args) {

        int a;
        Integer A;

        a = 10;
        A = 0;
        A = null;
        A = 15;

        System.out.println(A);

        A.toString();

        System.out.println(A.toString());

        System.out.println(A + A);
        System.out.println(A + A.toString());

        System.out.println(A.toString() + A);
        System.out.println(A.toString() + A.toString());
        System.out.println("15" + "15");

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer.sum(5, 10);
        System.out.println(Integer.sum(5, 10));
        int sum = Integer.sum(5, 10);
        System.out.println(sum);

        int c = 5;

        Integer.valueOf(c);

//        System.out.println(a);
//        System.out.println(A);
//
//        System.out.println(d);
//        System.out.println(D);
//
//        System.out.println(S);
    }
}


