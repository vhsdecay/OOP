package HW.lesson3.task_1;
// 
// Задача 1:
// В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.
// В первом варианте вам нужно добавить реализацию собственного функционального интерфейса 
// к предыдущему ДЗ. Вы можете выбрать любой класс или часть кода из предыдущего ДЗ и 
// добавить свой собственный функциональный интерфейс, описывающий необходимое поведение.
// 
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        // Стандартный прямоугольник
        Rectangle rec1 = new Rectangle();
        System.out.printf("Параметры стандартного прямоугольника [%d x %d]:\n", rec1.getWidth(), rec1.getHeight());
        System.out.printf("Площадь = %d; Периметр = %d\n", rec1.calculateArea(), rec1.calculatePerimeter());
        
        // Пользовательский данные:
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника: ");
        int width = in.nextInt(); 
        System.out.print("Введите ширину прямоугольника: ");
        int height = in.nextInt();
        in.close();

        // Функциональные интерфейсы:
        i_GetArea area = (a, b)->{
            int result = a * b;
            return result;
        };
        i_GetPerimeter perimeter = (a, b)->{
            int result = 2 * (a + b);
            return result;
        };
        
        System.out.printf("Параметры стандартного прямоугольника [%d x %d]:\n", width, height);
        System.out.printf("Площадь = %d; Периметр = %d", area.getArea(width, height), perimeter.getPerimeter(width, height));
    }
}
