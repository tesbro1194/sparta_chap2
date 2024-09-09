package chap2_team12.challenge.operator;

import chap2_team12.challenge.Operand;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide extends AbstractOperator {
    @Override
    public BigDecimal operate(Operand firstNumber, Operand secondNumber) {
        if (secondNumber.getValue().equals(BigDecimal.ZERO)) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return firstNumber.getValue().divide(secondNumber.getValue(), RoundingMode.HALF_UP);
    }
}
