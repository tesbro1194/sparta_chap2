package chap2_team12.challenge;


import chap2_team12.challenge.operator.*;

public enum OperatorType {
    ADD("+", new Add()),
    SUB("-", new Subtract()),
    MUL("*", new Multiply()),
    DIV("/", new Divide());

    private final String type;
    private final AbstractOperator operator;

    OperatorType(String type, AbstractOperator operator) {
        this.type = type;
        this.operator = operator;
    }

    public static AbstractOperator getOperatorBySymbol(String operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.type.equals(operator)) return op.operator;
        }

        throw new IllegalArgumentException("제공하지 않는 연산입니다.");
    }
}
