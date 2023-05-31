package HW.lesson1.task_2;
// 
// Задача 2:
// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
// 
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        // Стандартный прямоугольник
        Rectangle rec1 = new Rectangle();
        System.out.printf("Параметры стандартного прямоугольника [%d x %d]:\n", rec1.getWidth(), rec1.getHeight());
        System.out.printf("Площадь = %d; Периметр = %d\n", rec1.calculateArea(), rec1.calculatePerimeter());
        // Пользовательский прямоугольник
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника: ");
        int width = in.nextInt(); 
        System.out.print("Введите ширину прямоугольника: ");
        int height = in.nextInt();
        in.close();
        Rectangle rec2 = new Rectangle(width, height);
        System.out.printf("Параметры стандартного прямоугольника [%d x %d]:\n", rec2.getWidth(), rec2.getHeight());
        System.out.printf("Площадь = %d; Периметр = %d", rec2.calculateArea(), rec2.calculatePerimeter());
    }
}
