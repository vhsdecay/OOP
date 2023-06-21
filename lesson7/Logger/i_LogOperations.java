package HW.lesson7.Logger;

import HW.lesson7.ComplexNum.ModelComplexNum;

public interface i_LogOperations {
    void addLogComplexNum(ModelComplexNum Z1, ModelComplexNum Z2);
    void addLogOperation(String oper, String log);
    void getLogs();

}
