package HW.lesson6.Shapes.Rectangle;

import HW.lesson6.Shapes.Rectangle.Functions.*;
//
// Создан класс, функции который можно расширять, если понадобятся другие действия ;
//
// Отдельно созданны требуемые методы получения площяди, периметра. (Немного не понял)
//
public class RecFunctions implements i_CalcAreaRec, i_CalcPerimRec, i_TypeRec{

    @Override
    public void calcArea(int heght, int width) {
        int area = heght * width;
        System.out.println("Площадь = " + area);
    }
    @Override
    public void calcPerim(int heght, int width) {
        int perim = 2* (heght + width);
        System.out.println("Периметр = " + perim);
    }
    @Override
    public void typeArea(int heght, int width) {
        System.out.println("// Реализация метода получения типа прямоугольника");
    }
}
