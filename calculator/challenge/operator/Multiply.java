package chap2_team12.calculator.challenge.operator;


import chap2_team12.calculator.challenge.Operand;

public class Multiply extends AbstractOperator<Operand> {
    @Override
    public double operate(Operand firstNumber, Operand secondNumber) {
        return firstNumber.getValue() * secondNumber.getValue();
    }
}
