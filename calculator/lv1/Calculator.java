package calculator.lv1;

import java.util.Scanner;

public class Calculator {

    static final String ADD = "+";
    static final String SUBTRACT = "-";
    static final String DIVIDE = "/";
    static final String MULTIPLY = "*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // flag가 false될 때까지 무한 반복
        boolean flag = true;
        while(flag) {
            // 두 정수 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            long firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            long secondNumber = sc.nextInt();

            // 남아있는 개행문자 소비
            sc.nextLine();

            // 연산자 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.nextLine();

            // 양의 정수 검증
            validatePositiveInteger(firstNumber, secondNumber);
            // 연산자 검증
            validateArithmeticOperator(operator);

            long result = 0;
            switch (operator) {
                case ADD -> result = firstNumber + secondNumber;
                case SUBTRACT -> result = firstNumber - secondNumber;
                case DIVIDE -> {
                    // 나누기 연산 검증 처리
                    try {
                        result = firstNumber / secondNumber;
                    } catch (ArithmeticException exception) {
                        throw new ArithmeticException("[Error] : 나누기 연산 시 분모는 0이 될 수 없습니다.");
                    }

                }
                case MULTIPLY -> result = firstNumber * secondNumber;
            }

            System.out.println("결과 : " + result);

            // exit 입력시 반복문 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if(sc.nextLine().equals("exit")) {
                flag = false;
            }
        }
    }
    static void validateArithmeticOperator(String operator) {
        if(!operator.equals(ADD) && !operator.equals(SUBTRACT) && !operator.equals(DIVIDE) && !operator.equals(MULTIPLY)) {
            throw new IllegalArgumentException("[Error] : 사칙연산('+', '-', '/', '*')만 입력 가능합니다.");
        }
    }

    static void validatePositiveInteger(long firstNumber, long secondNumber) {
        if (firstNumber < 0 || secondNumber < 0) {
            throw new IllegalArgumentException("[Error] : 양의 정수만 입력 가능합니다.");
        }
    }
}
