package calculator.challenge.operator;

public class Add extends AbstractOperator<Number> {
    @Override
    public Number operate(Number firstNumber, Number secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }
}
