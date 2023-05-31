package HW.lesson1.task_1;

public class Cat {
    private String name;
    private int age;
    private Owner owner;
    
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.owner = null;
    }

    public Cat(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.owner = new Owner(ownerName);
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public Owner getOwner() {return owner;}

    public void greet() {
        if (getOwner() == null){
            System.out.printf("Мяу! Меня зовут <%s>. Мне <%d> года(лет).\n", getName(), getAge());
        } else {
            System.out.printf("Мяу! Меня зовут <%s>. Мне <%d> года(лет). Мой владелец - <%s>.\n", getName(), getAge(), getOwner());
        }
    }
}
