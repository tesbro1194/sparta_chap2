package week4;

import week4.operators.*;

import java.util.regex.Pattern;

/**
 * Parser라는 변환 클래스가 있기 때문에 변환 시 발생하는 예외는 Parser클래스에서 예외처리를 해주었습니다.
 * Calculator내부의 숫자들을 객체로 만들고 해당 객체 내에서 예외 처리를 해도 좋을 거 같습니다.
 */
public class Parser {
    static final String ADD = "+";
    static final String SUBTRACT = "-";
    static final String DIVIDE = "/";
    static final String MULTIPLY = "*";
    static final String REMAINDER = "%";
    private static final String OPERATION_REG = "[+\\-*/%]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    // Parser를 반환할 필요가 없는 것 같아 void로 수정했습니다.
    public void parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        if(Pattern.matches(NUMBER_REG, firstInput)) {
            calculator.setFirstNumber(Integer.parseInt(firstInput));
        } else {
            throw new BadInputException("0 ~ 9 (정수)");
        }
    }

    public void parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        if(Pattern.matches(NUMBER_REG, secondInput)) {
            calculator.setSecondNumber(Integer.parseInt(secondInput));
        } else {
            throw new BadInputException("0 ~ 9 (정수)");
        }
    }

    public void parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        if(Pattern.matches(OPERATION_REG, operationInput)) {
            switch (operationInput) {
                case ADD -> calculator.setOperation(new Add());
                case SUBTRACT -> calculator.setOperation(new Subtract());
                case DIVIDE -> calculator.setOperation(new Divide());
                case MULTIPLY -> calculator.setOperation(new Multiply());
                case REMAINDER -> calculator.setOperation(new Remainder());
                default -> throw new BadInputException(ADD + ", " + SUBTRACT + ", " + DIVIDE + ", " + MULTIPLY + ", " + REMAINDER);
            }
        } else {
            throw new BadInputException(ADD + ", " + SUBTRACT + ", " + DIVIDE + ", " + MULTIPLY + ", " + REMAINDER);
        }
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}