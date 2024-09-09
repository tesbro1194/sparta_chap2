package chap2_team12.challenge;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Display {

    private static final String EXIT_COMMAND = "아니오";
    private static final String CONTINUE_COMMAND = "예";
    private final Scanner scanner = new Scanner(System.in);

    public Operand readNumber() {
        System.out.print("숫자를 입력하세요.");
        return new Operand(scanner.nextLine());
    }

    public String readOperator() {
        System.out.print("사칙연산 기호를 입력하세요: ");
        return scanner.nextLine();
    }

    public boolean readContinueOrExit() {
        System.out.println("더 계산하시겠습니까? - 예, 아니오 입력.");
        String command = scanner.nextLine();
        if (command.equals(CONTINUE_COMMAND)) return false;
        else if (command.equals(EXIT_COMMAND)) return true;
        else throw new IllegalStateException("예, 아니오만 입력 가능합니다.");
    }

    public void printResult(BigDecimal result) {
        System.out.println("결과 : " + result);
    }

    public void printLogs(ResultLogs logs) {
        System.out.println("결과 리스트 조회 - 조회, 건너뛰기 입력.");
        printByFilter(logs.getAllLogs());
    }

    public void printResultMoreThan(ResultLogs logs, BigDecimal number) {
        System.out.println("현재 값보다 큰 값 조회 - 조회, 건너뛰기 입력.");
        printByFilter(logs.filter(log -> log.moreThan(number)));
    }

    private void printByFilter(List<ResultLog> logs) {
        String command = scanner.nextLine();
        if (command.equals("조회")) {
            System.out.println(logs);
        } else if (command.equals("건너뛰기")) {
            System.out.println("조회 건너뜀.");
        } else {
            throw new IllegalArgumentException("조회, 건너뛰기만 입력 가능합니다.");
        }
    }
}
