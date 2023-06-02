package HW.lesson2;


public class Owner implements i_Owner{

    private String name;

    public Owner(String name){
        this.name = name;
    }
    public String getName(){return name;}
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String Brought() {return "забрал: ";}
    @Override
    public String Took() {return "привёл: ";}
}
