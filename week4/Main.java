package week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //boolean calculateEnded = false;
        // 구현 2.

        /**
         * CalculatorApp.start()가 boolean을 반환하기 때문에 반복문의 조건으로 넣어줬습니다.
         * 그렇기 때문에 calculatedEnded 변수를 사용할 필요가 없어져 주석처리 했습니다.
         */
        while(CalculatorApp.start()) {
            System.out.println("종료 하려면 'exit'를 입력하세요");
            if(sc.nextLine().equals("exit")) break;

//            calculateEnded = sc.nextLine().equals("exit");
//            if(calculateEnded) break;
        }
    }
}