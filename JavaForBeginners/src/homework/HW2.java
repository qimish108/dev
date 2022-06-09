package homework;

public class HW2 {

    public static void main(String[]Agrs){

        int k = 3;
        int l = 6;
        int m = 10;
        int sumKL = k + l;
        int mulKM = k * m;
        int subLM = l - m;
        int divKL = k / l;
        int ostKL = k % l;
        int divKM = k / m;
        int ostKM = k % m;
        int apple = 100;
        int student = 21;
        int divAppleForStudents = apple / student;
        int ostAppleForTeacher = apple % student;
        m++;
        int sumKLM = k + l + m;
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        int result21 = (x + 3)*(x + 3);
        int result22 = ((3 + (4 * x)) / 5) - ((10 * (y - 5) * (a + b + c )) / x) + (9 *((4 / x) +((9 + x) / y)));
        String line = "______________";






        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.print(k);
        System.out.print(l);
        System.out.println(m);

        System.out.println("" + k + ", " + l + ", " + m);

        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + mulKM);
        System.out.println("Разность переменных l и m = " + subLM);

        System.out.println("Результат деления k на l = " + divKL + " а остаток от деления  = " + ostKL);
        System.out.println("Результат деления k на m = " + divKM + " а остаток от деления  = " + ostKM);

        System.out.println("Если "+ apple +" яблок поделить на "+ student + " учеников, то каждый ученик получит"
                + " по " + divAppleForStudents + " яблок, и "+ ostAppleForTeacher +" яблока останется учителю.");

        System.out.println(sumKLM);

        System.out.println(result21);
        System.out.println(result22);

        System.out.println("task    result");
        System.out.println(line);
        System.out.println("21       " + result21);
        System.out.println("22       " + result22);







    }
}
