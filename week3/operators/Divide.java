package calculator.operators;

public class Divide extends Operator {
    @Override
    public double operate(int a, int b) {
        return (double) a / b;
    }
}
