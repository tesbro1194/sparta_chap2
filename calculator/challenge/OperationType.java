package calculator.challenge;

import calculator.challenge.operator.AbstractOperator;
import calculator.challenge.operator.*;

public enum OperationType {
    ADD("+", new Add()),
    SUB("-", new Subtract()),
    MUL("*", new Multiply()),
    DIV("/", new Divide());

    private final String type;
    private final AbstractOperator<Number> operator;

    OperationType(String type, AbstractOperator<Number> operator) {
        this.type = type;
        this.operator = operator;
    }

    public static AbstractOperator<Number> getOperatorBySymbol(String operator) {
        for(OperationType op : OperationType.values()) {
            if(op.type.equals(operator)) return op.operator;
        }

        throw new IllegalArgumentException("제공하지 않는 연산입니다.");
    }
}
