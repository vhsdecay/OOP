package HW.lesson6.Shapes.Rectangle;
import HW.lesson6.Figure;
//
// Создан класс прямоугольник на основе базового класса фигуры;
// (В нём прописанна только логика создания прямоугольника, логика вызова действий);
//
// В отдельный класс вынесенны математ. действия
// (Подробнее RecFunctions...)
//
// В отдельный метод так же вынесен сканер, если для программы потребуется ввод
// других типов данных, мы его расширим.
//
public class Rectangle extends Figure {
    private int height;
    private int width;

    RecFunctions functions;
    RecScaner scaner;

    public Rectangle(RecFunctions func, RecScaner scan) {
        this.functions = func;
        this.scaner = scan;
        this.height = scaner.getValue("Введите высоту прямоугольника: ");
        this.width = scaner.getValue("Введите ширину прямоугольника: ");
    }

    public void Area(){
        functions.calcArea(height, width);
    }
    public void Perimetr(){
        functions.calcPerim(height, width);
    }

    @Override
    public void figuraName() {
        System.out.println("Прямоугольник");
    }
}
