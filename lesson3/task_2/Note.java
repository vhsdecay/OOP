package HW.lesson3.task_2;

public abstract class Note {

    private String model;
    private String processor;
    private int hardDisk;
    private int ram;
    private int cost;

    public Note(String model, String processor, int hardDisk, int ram, int cost) {
        this.model = model;
        this.processor = processor;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.cost = cost;
    }

    public String getModel() {return model;}
    public String getProcessor() {return processor;}
    public int getHardDisk() {return hardDisk;}
    public int getRam() {return ram;}
    public int getCost() {return cost;}

    @Override
    public String toString() {
        String out = "[Модель: " + getModel() +"] HD: " + getHardDisk()+", RAM: " + getRam() + " Стоимость: " + getCost()+".";
        return out;
    }
}
