package HW.lesson5;

public class CalcPresenter {
    CalcViewer viewer;
    CalcModel model;

    public CalcPresenter(CalcViewer view, CalcModel model){
        this.viewer = view;
        this.model = model;
    }

    public void formaCalculator() {
        double firstNum = viewer.getValue("Введите первое число: ");
        char operator = viewer.getOperator();
        double twoNum = viewer.getValue("Введите второе число: ");
        // ---------------------------------------------
        switch (operator){
            case '+':
                viewer.getResult(model.numSum(firstNum, twoNum));
                break;
            case '-':
                viewer.getResult(model.numSub(firstNum, twoNum));
                break;
            case '*':
                viewer.getResult(model.numMult(firstNum, twoNum));
                break;
            case '/':
                viewer.getResult(model.numDiv(firstNum, twoNum));
                break;
            default:
                break;
        }
    }
}
