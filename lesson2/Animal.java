package HW.lesson2;

public abstract class Animal {
    private String name;
    private int age;
    private Owner owner;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.owner = null;
    }

    public Animal(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.owner = new Owner(ownerName);
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public Owner getOwner() {return owner;}

}
