package calculator.challenge.operator;

public abstract class AbstractOperator<T extends Number> {
    public abstract T operate(T firstNumber, T secondNumber);
}
