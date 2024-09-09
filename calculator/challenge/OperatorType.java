package chap2_team12.calculator.challenge;


import chap2_team12.calculator.challenge.operator.*;

public enum OperatorType {
    ADD("+", new Add()),
    SUB("-", new Subtract()),
    MUL("*", new Multiply()),
    DIV("/", new Divide());

    private final String type;
    private final AbstractOperator<Operand> operator;

    OperatorType(String type, AbstractOperator<Operand> operator) {
        this.type = type;
        this.operator = operator;
    }

    public static AbstractOperator<Operand> getOperatorBySymbol(String operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.type.equals(operator)) return op.operator;
        }

        throw new IllegalArgumentException("제공하지 않는 연산입니다.");
    }
}
