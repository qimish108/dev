package Lesson3;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";
        Dog[] myDogs = new Dog[4];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        myDogs[3] = new Dog();

        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";
        myDogs[3].name = "Тузик";

        System.out.println("Имя последней собаки -");
        System.out.println(myDogs[3].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }
}
