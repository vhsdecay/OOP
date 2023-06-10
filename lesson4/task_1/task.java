package HW.lesson4.task_1;
// 
// Задача 1 : 
// Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
// В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. Мы просто выводим 
// этот элемент на консоль с помощью метода System.out.println(). В методе main мы вызываем printElement с различными типами 
// данных: целое число (Integer), строку (String) и число с плавающей запятой (Double). Компилятор автоматически выводит тип 
// параметра T на основе переданных аргументов.
// 
public class task {
    public static void main(String[] args) {

        Element<Integer> element_int = new Element<>(1);
        Element<String> element_str = new Element<>("Один");
        Element<Double> element_dou = new Element<>(1.1);

        System.out.println(element_int);
        System.out.println(element_str);
        System.out.println(element_dou);

    }
}
