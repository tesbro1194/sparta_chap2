package chap2_team12.calculator.challenge.operator;

public abstract class AbstractOperator<Operand> {
    public abstract double operate(Operand firstNumber, Operand secondNumber);
}
