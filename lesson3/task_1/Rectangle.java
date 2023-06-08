package HW.lesson3.task_1;

public class Rectangle {
    private int width;
    private int height;

    /**
     * Конструктор со стандартными параметрами
     */
    public Rectangle() {
        this.width = 20;
        this.height = 100;
    }
    /**
     * Конструктор c параметрами
     * @param width Высота прямоугольника
     * @param height Ширина прямоугольника
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}

    public int calculateArea(){
        int area = getWidth() * getHeight();
        return area;
    }

    public int calculatePerimeter(){
        int perimeter = 2 * (getWidth() + getHeight());
        return perimeter;
    }
}
