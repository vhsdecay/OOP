package HW.lesson4.task_2;
// 
// Задача 2 : 
// Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на 
// консоль.В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. 
// Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
// 
public class task {
    public static void main(String[] args) {

        Printer printer = new Printer();

        String[] str_array = {"Один", "Два", "Три", "Четрые", "Пять"};
        Integer[] int_array = {1, 2, 3, 4, 5};
        Double[] dou_array = {1.1, 2.2, 3.3, 4.4, 5.5};

        printer.<String>printArray(str_array);
        printer.<Integer>printArray(int_array);
        printer.<Double>printArray(dou_array);

    }
}
