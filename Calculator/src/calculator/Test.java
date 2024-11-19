package calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1, num2;
            String operator;

            // 첫 번째 숫자 입력
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                num1 = scanner.nextInt();
                if (0 <= num1) {
                    break;
                } else {
                    System.out.println("0 이상 양의 정수 값을 입력하세요.");
                }
            }

            // 사칙연산 기호 입력
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                operator = scanner.next();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    break; // 올바른 기호를 입력받으면 반복 종료
                } else {
                    System.out.println("잘못된 연산 기호입니다. 다시 입력해주세요.");
                }
            }

            // 두 번째 숫자 입력
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요 : ");
                num2 = scanner.nextInt();
                if (0 <= num2) {
                    break;
                } else {
                    System.out.println("0 이상 양의 정수 값을 입력하세요.");
                }
            }

            // 계산 수행
            if (operator.equals("+")) {
                System.out.println("결과: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("결과: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("결과: " + (num1 * num2));
            } else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 숫자)가 0이 될 수 없습니다.");
                } else {
                    System.out.println("결과: " + ((double) num1 / num2));
                }
            }

            // 추가 계산 여부 확인
            System.out.print("더 계산하시겠습니까? (y / n): ");
            String exit = scanner.next();
            if (exit.equalsIgnoreCase("n")) {
                System.out.println("계산기를 종료합니다.");
                break; // 프로그램 종료
            }
        }

        scanner.close(); // 스캐너 닫기
    }
}