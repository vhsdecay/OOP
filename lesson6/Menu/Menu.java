package HW.lesson6.Menu;

//
// Созданно отдельное меню которое относится только к саммой программе
// В отдельный класс вынесенно меню, конкретно для прямоугольника (таким образом), можно реализовать
// другие меню, для других фигур, нам останется только реализовать метод запуска в основном меню.
//
// (Так же метод выбираймой пользователем операции вынесен в отдельный класс) на случай если для других фигур
// нам понадобятся другие типы данных;
//

public class Menu {
    int number;

    public void ProgramMenu(){
        System.out.printf("Выберите фигуру для расчётов(1 - Прямоугольник / 2 - круг): ");
        int operation = new MenuScanner().inputOperation();
        switch (operation){
            case 1:
                MenuRectangle menu_1 = new MenuRectangle(); // Создание меню прямоугольника
                menu_1.StartMenu(); // Вызов меню прямоугольника
                break;
            case 2:
                System.out.println("// Вызов меню 'Круга'");
                break;
        }
    }
}
