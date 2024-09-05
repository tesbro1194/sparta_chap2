package calculator.operators;

public class Remainder extends Operator {
    @Override
    public double operate(int a, int b) {
        return a % b;
    }
}
