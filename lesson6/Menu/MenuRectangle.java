package HW.lesson6.Menu;

import HW.lesson6.Shapes.Rectangle.*;

public class MenuRectangle {

    public void StartMenu(){
        while (true) {
            System.out.printf("Выберите операцию (1 - Задать новый прямоугольник / 0 - выйти): ");
            int operation = new MenuScanner().inputOperation();
            if (operation == 0) {
                break;
            } else {
                Rectangle rectangle = new Rectangle(new RecFunctions(), new RecScaner());
                while (true){
                    System.out.printf("Выберите операцию (1 - Посчитать площадь / 2 Посчитать периметр / 0 - выйти): ");
                    if (operation == 0){
                        System.out.println();
                        break;
                    }else {
                        operation = new MenuScanner().inputOperation();
                        switch (operation){
                            case 1:
                                rectangle.Area();
                                break;
                            case 2:
                                rectangle.Perimetr();
                                break;
                        }
                    }
                }
            }
        }
    }
}
