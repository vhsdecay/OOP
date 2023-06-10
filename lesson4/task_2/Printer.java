package HW.lesson4.task_2;

import java.util.ArrayList;
import java.util.List;

class Printer{
     
    public <T> void printArray(T[] items){
        List<T> listArray = new ArrayList<T>();
        System.out.printf("Элементы массива: [Кол.эл. = %d] [Класс.эл. = %s]\n", items.length, items.getClass());
        for(T item: items){
            listArray.add(item);
        }
        System.out.println(listArray);
    }
}
// , 