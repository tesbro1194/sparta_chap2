package chap2_team12.calculator.challenge;


import chap2_team12.calculator.challenge.operator.AbstractOperator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final Display display;
    private final List<ResultLog> resultLogs = new ArrayList<>();
    private boolean isRunning = true;

    public Calculator(Display display) {
        this.display = display;
    }

    public void run() {
        while (isRunning) {
            Operand first = display.readNumber();
            Operand second = display.readNumber();
            String operator = display.readOperator();

            double result = calculate(operator, first, second);
            display.printResult(result);

            saveLog(first, second, result, operator);

            display.printLogs(resultLogs);
            display.printResultMoreThan(resultLogs, result);

            if (display.readContinueOrExit()) isRunning = false;
        }
    }

    private double calculate(String inputOperator, Operand first, Operand second) {
        AbstractOperator<Operand> operator = OperatorType.getOperatorBySymbol(inputOperator);
        return operator.operate(first, second);
    }

    private void saveLog(Operand first, Operand second, double result, String operator) {
        resultLogs.add(new ResultLog(first, second, result, operator));
    }
}
