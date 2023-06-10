package HW.lesson4.task_1;

public class Element<T> {

    private T element;
    
    public Element(T element){
        this.element = element;
    }

    public T getElement(){return element;}

    @Override
    public String toString() {
        return String.format("%s : Тип -> %s", getElement(), element.getClass());
    }
}
