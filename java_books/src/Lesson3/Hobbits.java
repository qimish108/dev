package Lesson3;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
       /* h[0] = new Hobbits();
        h[1] = new Hobbits();
        h[2] = new Hobbits();

       h[0].name = "Бильбо";
       h[1].name = "Фродо";
       h[2].name = "Сем";*/

        int z = -1;

        while (z < 2){
            z = z +1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";
            if (z == 1){
                h[z].name = "Фродо";
            }
            if (z == 2 ){
                h[z].name = "Сем";
            }
            System.out.print(h[z].name + " - ");
            System.out.print("Имя хорошего хоббита ");

        }


    }
}
