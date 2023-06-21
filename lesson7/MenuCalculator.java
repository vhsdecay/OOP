package HW.lesson7;

import HW.lesson7.Actions.ModelActions;
import HW.lesson7.ComplexNum.ModelComplexNum;
import HW.lesson7.Logger.Logger;
import HW.lesson7.Scaner.Scaner;


public class MenuCalculator {

    Logger logger;

    public MenuCalculator(Logger logger){
        this.logger = logger;
    }

    public void startMenu(ModelComplexNum Z1, ModelComplexNum Z2){
        Scaner scan = new Scaner();
        ModelActions actions = new ModelActions();
        // Меню мат.действий с комплексными числами
        while (true){
            char operation = scan.getOperator();
            if (Character.getNumericValue(operation) == 0){
                System.out.println("-------------------------------------------------------------------");
                break;
            }else {
                switch (operation){
                    case '+':
                        System.out.println(actions.compleSum(Z1.getA(), Z1.getB(), Z2.getA(), Z2.getB()));
                        logger.addLogOperation("Сложения",actions.compleSum(Z1.getA(), Z1.getB(), Z2.getA(), Z2.getB()));
                        break;
                    case '*':
                        System.out.println(actions.compleMult(Z1.getA(), Z1.getB(), Z2.getA(), Z2.getB()));
                        logger.addLogOperation("Умножения",actions.compleMult(Z1.getA(), Z1.getB(), Z2.getA(), Z2.getB()));
                        break;
                    case '/':
                        System.out.println(actions.compleDiv(Z1.getA(), Z1.getB(), Z2.getA(), Z2.getB()));
                        logger.addLogOperation("Деления", actions.compleMult(Z1.getA(), Z1.getB(), Z2.getA(), Z2.getB()));
                        break;
                    }
            }
        }
    }
}
