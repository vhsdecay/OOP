package HW.lesson5;

public class CalcModel {

    public double result;

    public double numSum(double first, double two){
        result = first + two;
        return result;
    }
    public double numSub(double first, double two){
        result = first - two;
        return result;
    }

    public double numMult(double first, double two){
        result = first * two;
        return result;
    }

    public double numDiv(double first, double two){
        result = first / two;
        return result;
    }
}
