package HW.lesson7.Actions;

public class ModelActions { // Класс содержащий мат.действия с комплексными числами

    public String compleSum(Double a, Double b, Double c, Double d){
        Double Z1 = a + c;
        Double Z2 = b + d;
        String result = String.format("Результат = %.3f + %.3fi", Z1, Z2);
        return result;
    }

    public String compleMult(Double a, Double b, Double c, Double d){
        Double Z1 = (a * c) - (b * d);
        Double Z2 = (a * d) + (b * c);
        String result = String.format("Результат = %.3f + %.3fi", Z1, Z2);
        return result;
    }

    public String compleDiv(Double a, Double b, Double c, Double d){
        Double Z1 = ((a * c) + (b * d))/((c * c) + (d * d));
        Double Z2 = ((b * c) - (a * d))/((c * c) + (d * d));
        String result = String.format("Результат = %.3f + %.3fi", Z1, Z2);
        return result;
    }

}
