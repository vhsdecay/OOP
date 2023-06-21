package HW.lesson7.Scaner;

import java.util.Scanner;

public class Scaner implements i_GetOperator, i_GetMenuChar{

    Scanner scan = new Scanner(System.in);

    public String getComplexNum(String title) {
        System.out.printf("Введите " + title +" в формате (A + Bi) пример (2 - 8): ");
        return scan.nextLine();
    }
    @Override
    public char getOperator() {
        System.out.printf("Выберите действие c комплексными числами (+ * /) или 0 - для выхода: ");
        return scan.next().charAt(0);
    }

    @Override
    public char getMenuChar() {
        System.out.printf("Выберите действие (+ новый расчёт ; ! история) или 0 - для выхода: ");
        return scan.next().charAt(0);
    }
}
