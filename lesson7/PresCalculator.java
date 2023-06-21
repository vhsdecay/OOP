package HW.lesson7;

import HW.lesson7.ComplexNum.ModelComplexNum;
import HW.lesson7.ComplexNum.PresComplexNum;
import HW.lesson7.Logger.Logger;
import HW.lesson7.Output.Output;
import HW.lesson7.Scaner.Scaner;
public class PresCalculator {
    Scaner scan;
    Output output;
    Logger logger;
    public PresCalculator(){
        this.output = new Output();
        this.scan = new Scaner();
        this.logger = new Logger();
    }
    public void startCalculator(){
        // Приветствие
        output.getWelcome();
        // Создание презентора комплексных чисел
        PresComplexNum presenter = new PresComplexNum(new ModelComplexNum(), new Scaner());
        // Логика меню калькулятора
        while (true){
            char operation = scan.getMenuChar();
            System.out.println("-------------------------------------------------------------------");
            if (Character.getNumericValue(operation) == 0){
                System.out.println();
                break;
            }else {
                switch (operation){
                    case '+':
                        // Создание, вызов запроса от пользователя на ввод параметров для комплексных чисел
                        ModelComplexNum Z1 = presenter.getComplexNum("Z1");
                        ModelComplexNum Z2 = presenter.getComplexNum("Z2");
                        // Вывод созданных комплексных
                        System.out.printf("Комплексные числа: Z1 = %s, Z2 = %s\n", Z1.getZ(), Z2.getZ());
                        logger.addLogComplexNum(Z1 , Z2);
                        System.out.println("-------------------------------------------------------------------");
                        MenuCalculator menu = new MenuCalculator(logger);
                        menu.startMenu(Z1, Z2);
                        break;
                    case '!':
                        logger.getLogs();
                        break;
                }
            }
        }
        output.getGoodbye();
    }
}
