package chap2_team12.challenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Display(), new ResultLogs());

        calculator.run();
    }
}
