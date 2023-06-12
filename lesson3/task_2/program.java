package HW.lesson3.task_2;
import HW.lesson3.task_2.Prod.*;
// 
// Задача 2:
// Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) 
// 
public class program {
    public static void main(String[] args) {

        Market market_ASUS = new Market();
        market_ASUS.addProduct(new Asus("UX31", "Intel I7", 500, 8, 10000));
        market_ASUS.addProduct(new Asus("ROG", "AMD Ryzen7", 512, 16, 11000));
        market_ASUS.addProduct(new Asus("AIR6", "Core i3", 600, 8, 12000));
        market_ASUS.addProduct(new Asus("A313", "Intel I7", 500, 4, 8000));
        
        Market market_Xiaomi = new Market();
        market_Xiaomi.addProduct(new Xiaomi("Blood", "Core i3", 256, 8, 12400));
        market_Xiaomi.addProduct(new Xiaomi("RedmiBook 15", "AMD Ryzen7", 600, 16, 15000));
        market_Xiaomi.addProduct(new Xiaomi("Zeen2", "Intel i3", 512, 8, 11000));
        market_Xiaomi.addProduct(new Xiaomi("RedmiBook 13", "Intel I7", 256, 16, 12000));

        System.out.printf("Ноутбуки ASUS [%d]\n", market_ASUS.getSize());
        for(var item : market_ASUS){
            if (item.getClass() == Asus.class){
                System.out.println(item);
            }
        }
        System.out.printf("Ноутбуки Xiaomi [%d]\n", market_Xiaomi.getSize());
        for(var item : market_Xiaomi){
            if (item.getClass() == Xiaomi.class){
                System.out.println(item);
            }
        }
    }
}