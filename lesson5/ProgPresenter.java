package HW.lesson5;

public class ProgPresenter {

    ProgViewer viewer;

    public ProgPresenter(ProgViewer view){
        this.viewer = view;
    }

    public void formaProgram(){
        CalcPresenter calculator = new CalcPresenter(new CalcViewer(), new CalcModel());
        String comands = viewer.getComands();
        while (true) {
            if (comands.equals("ex")) {
                break;
            } else {
                switch (comands) {
                    case "p":
                    calculator.formaCalculator();
                    comands = viewer.getComands();
                    break;
                }
            }
        }
    }
}