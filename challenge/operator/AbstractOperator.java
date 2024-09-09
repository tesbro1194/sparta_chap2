package chap2_team12.challenge.operator;


import chap2_team12.challenge.Operand;

import java.math.BigDecimal;

public abstract class AbstractOperator {
    public abstract BigDecimal operate(Operand firstNumber, Operand secondNumber);
}
