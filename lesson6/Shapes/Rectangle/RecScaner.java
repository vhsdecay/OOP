package HW.lesson6.Shapes.Rectangle;

import java.util.Scanner;

public class RecScaner {
    Scanner scan = new Scanner(System.in);
    public int getValue(String title){  // Метод ввода параметра
        System.out.printf(title);
        return scan.nextInt();
    }

}
