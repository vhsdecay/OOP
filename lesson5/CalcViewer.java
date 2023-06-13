package HW.lesson5;

import java.util.Scanner;

public class CalcViewer {

    Scanner scan = new Scanner(System.in);

    public double getValue(String title){
        System.out.printf(title);
        return scan.nextDouble();
    }

    public char getOperator(){
        System.out.printf("Выберите действие (+ - * /): ");
        return scan.next().charAt(0);
    }

    public void getResult(double result){
        System.out.println("Результат: " + result);
    }

}
