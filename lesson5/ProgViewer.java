package HW.lesson5;


import java.util.Scanner;

public class ProgViewer {

    Scanner scanner = new Scanner(System.in);

    public String getComands() {
        System.out.println("Калькулятор: p - соверщить операцию / ex - закрыть калькулятор");
        return scanner.nextLine();
    }


}
