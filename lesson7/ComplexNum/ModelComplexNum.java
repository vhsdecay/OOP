package HW.lesson7.ComplexNum;

public class ModelComplexNum extends ComplexNum {

    double a;
    double b;
    char operator;
    public ModelComplexNum() {

    }
    public ModelComplexNum(double a, double b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public String getZ(){
        String Z = "(" + a + " " + operator + " " + b + "i)";
        return Z;
    }

    public Double getA(){return a;}
    public Double getB(){return b;}

}
