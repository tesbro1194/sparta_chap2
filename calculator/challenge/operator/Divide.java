package calculator.challenge.operator;

public class Divide extends AbstractOperator<Number> {
    @Override
    public Number operate(Number firstNumber, Number secondNumber) {
        if(secondNumber.equals(0)) throw new ArithmeticException("0으로 나눌 수 없습니다.");
         return firstNumber.doubleValue() / secondNumber.doubleValue();
    }
}
