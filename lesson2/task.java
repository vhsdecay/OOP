package HW.lesson2;

import HW.lesson2.Cat.*;
import HW.lesson2.Dog.Dog;

public class task {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Муся", 3);
        cat1.greet();

        Owner own1 = new Owner("Арётм");
        Cat cat2 = new Cat("Сёма", 3, own1.getName());
        System.out.printf("%s %s %s\n",own1.getName(),own1.Took(), cat2.getName());
        cat2.greet();
        System.out.printf("%s %s %s\n",own1.getName(),own1.Brought(), cat2.getName());

        Dog dog1 = new Dog("Барс", 5);
        dog1.greet();

        Owner own2 = new Owner("Алексей");
        Dog dog2 = new Dog("Бим", 2, own2.getName());
        System.out.printf("%s %s %s\n",own2.getName(),own2.Took(), dog2.getName());
        dog2.greet();
        System.out.printf("%s %s %s\n",own2.getName(),own2.Brought(), dog2.getName());

    }
}