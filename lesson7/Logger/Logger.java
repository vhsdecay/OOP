package HW.lesson7.Logger;

import HW.lesson7.ComplexNum.ModelComplexNum;

import java.util.ArrayList;

public class Logger implements i_LogOperations{

    ArrayList<String> logs;

    public Logger(){
        this.logs = new ArrayList<>();
    }

    @Override
    public void addLogComplexNum(ModelComplexNum Z1, ModelComplexNum Z2) {
        String num = "Введены новые комплексные числа Z1 = " + Z1.getZ() + "Z2 = " + Z1.getZ() + ";";
        logs.add(num);
    }

    @Override
    public void addLogOperation(String oper, String log) {
        String operation = String.format("Совершена операция: %s, %s", oper, log);
        logs.add(operation);
    }

    @Override
    public void getLogs() {
        System.out.println("История: ");
        if(logs.size() == 0) {
            System.out.println("История пуста, совершите операции !");
        }else {for (String log : logs) {System.out.println(log);}}
        System.out.println("-------------------------------------------------------------------");
    }
}
