package chap2_team12.calculator.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // flag가 false될 때까지 무한 반복
        boolean flag = true;
        while (flag) {
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

            // Calculator클래스 사용하여 계산 수정
            long result = Calculator.calculate(operator, firstNumber, secondNumber);
            System.out.println("결과 : " + result);

            // 전체조회, 조회, 수정 입력받기
            System.out.println("'전체조회', '조회', '수정' 입력해주세요. (그 외 입력은 건너뛰기 입니다.)");
            String historyCommand = sc.nextLine();
            if (historyCommand.equals("조회")) {
                System.out.println("조회할 기록의 인덱스를 입력해주세요.");
                int index = sc.nextInt();

                sc.nextLine();

                System.out.println("조회 결과 : " + Calculator.getHistoryById(index));
            }

            if (historyCommand.equals("수정")) {
                System.out.println("수정할 기록의 인덱스를 입력해주세요.");
                int index = sc.nextInt();
                System.out.println("수정할 기록의 값을 입력해주세요.");
                long value = sc.nextLong();

                sc.nextLine();
                Calculator.setHistoryById(index, value);
                System.out.println("수정 결과 : " + Calculator.getHistoryById(index));
            }

            if (historyCommand.equals("전체조회")) {
                System.out.println("조회 결과 : " + Calculator.getAllHistory());
            }

            // exit 입력시 반복문 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.nextLine().equals("exit")) {
                flag = false;
            }
        }
    }

}
