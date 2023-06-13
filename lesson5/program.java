package HW.lesson5;
//
// Задача 1:
// Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter),
// c возможностью выполнения базовых математических операций, таких как сложение, вычитание,
//  умножение и деление, работающий с дробными числами.
//
public class program {
    public static void main(String[] args) {

        ProgPresenter program = new ProgPresenter(new ProgViewer());
        program.formaProgram();

    }
}
