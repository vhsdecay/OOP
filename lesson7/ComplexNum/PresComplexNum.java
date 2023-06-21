package HW.lesson7.ComplexNum;

import HW.lesson7.Scaner.Scaner;

public class PresComplexNum {
    ModelComplexNum Z;
    Scaner scan;

    public PresComplexNum(ModelComplexNum Z, Scaner scan){
        this.Z = Z;
        this.scan = scan;
    }

    public ModelComplexNum getComplexNum(String title){
        String complexNum = scan.getComplexNum(title);
        String[] value = complexNum.split(" ");
        Z = new ModelComplexNum(Double.parseDouble(value[0]), Double.parseDouble(value[2]), value[1].charAt(0));
        return Z;
    }
}
