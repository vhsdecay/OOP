package HW.lesson1.task_1;

public class Owner {
    private String name;
    
    public Owner(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    @Override
    public String toString() {
        return getName();
    }
}
