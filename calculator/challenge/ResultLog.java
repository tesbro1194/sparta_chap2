package chap2_team12.calculator.challenge;

public class ResultLog {
    private final Operand first;
    private final Operand second;
    private final double result;
    private final String operationType;

    public ResultLog(Operand first, Operand second, double result, String operationType) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.operationType = operationType;
    }

    public boolean moreThan(double number) {
        return this.result > number;
    }

    @Override
    public String toString() {
        return first.getValue() + " " + operationType + " " + second.getValue() + " = " + result;
    }
}
