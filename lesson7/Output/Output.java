package HW.lesson7.Output;

public class Output implements i_Welcome, i_getGoodbye{
    @Override
    public void getWelcome() {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел ! -_-");
    }

    @Override
    public void getGoodbye() {
        System.out.println("Goodbye -_-");
    }
}
