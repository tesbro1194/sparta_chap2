package calculator.challenge;

import challenge.operator.AbstractOperator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private boolean isRunning = true;
    private final Display display;
    private final List<ResultLog> resultLogs = new ArrayList<>();

    public Calculator(Display display) {
        this.display = display;
    }

    public void run() {
        while(isRunning) {
            Number first = display.readNumber();
            Number second = display.readNumber();
            String operator = display.readOperator();

            double result = calculate(operator, first, second);
            display.printResult(result);

            saveLog(operator, first, result, second);

            display.printLogs(resultLogs);

            if(display.readContinueOrExit()) isRunning = false;
        }
    }

    private double calculate(String operator, Number first, Number second) {
        AbstractOperator<Number> op = OperationType.getOperatorBySymbol(operator);
        return op.operate(first, second).doubleValue();
    }

    private void saveLog(String operator, Number first, Number result, Number second) {
        resultLogs.add(new ResultLog(first, second, result, operator));
    }
}
