package calculator;

import calculator.operators.Operator;

public class Calculator {

    private Operator operator;

    public double calculate(int a, int b) {
        return operator.operate(a, b);
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
