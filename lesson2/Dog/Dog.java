package HW.lesson2.Dog;


import HW.lesson2.*;
public class Dog extends Animal implements i_Dog{

    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog(String name, int age, String ownerName) {super(name, age, ownerName);}

    @Override
    public String getType() {return voise + ", " + voise + ". Я "+ type;}

    public void greet() {
        if (getOwner() == null){
            System.out.printf("%s! Меня зовут <%s>. Мне <%d> года(лет).\n",getType(), getName(), getAge());
        } else {
            System.out.printf("%s! Меня зовут <%s>. Мне <%d> года(лет). Мой владелец - <%s>.\n",getType(), getName(), getAge(), getOwner());
        }
    }

}
