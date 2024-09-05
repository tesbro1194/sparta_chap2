package calculator;

import calculator.operators.*;

import java.util.Scanner;

public class Main {

    static final String ADD = "+";
    static final String SUBTRACT = "-";
    static final String DIVIDE = "/";
    static final String MULTIPLY = "*";
    static final String REMAINDER = "%";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operateCode = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calculator = new Calculator();
        switch (operateCode) {
            case ADD:
                calculator.setOperator(new Add());
                break;
            case SUBTRACT:
                calculator.setOperator(new Subtract());
                break;
            case DIVIDE:
                calculator.setOperator(new Divide());
                break;
            case MULTIPLY:
                calculator.setOperator(new Multiply());
                break;
            case REMAINDER:
                calculator.setOperator(new Remainder());
                break;
            default:
                throw new UnsupportedOperationException("[ERROR] : 제공되지 않는 연산자입니다.");
        }

        double result = calculator.calculate(num1, num2);
        System.out.println(result);
    }
}
