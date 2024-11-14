package calculator;

import java.util.Scanner;

public class CalLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1;
            int num2;

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = scanner.nextInt();
                if (0 <= num1) {
                    break;
                } else {
                    System.out.println("0이상 양의 정수 값을 입력하세요.");
                }
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = scanner.nextInt();
                if (0 <= num2) {
                    break;
                } else {
                    System.out.println("0이상 양의 정수 값을 입력하세요.");
                }
            }

            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                String operator = scanner.next();
                // String operator = scanner.nextLine(); 사용했을 경우 연산 기호 입력값이 틀렸다는 오류 발생 줄바꿈까지 읽어와서 인식을 못 하는듯 함

                if (operator.equals("+")) {
                    System.out.println("결과: " + (num1 + num2));
                    break;
                } else if (operator.equals("-")) {
                    System.out.println("결과: " + (num1 - num2));
                    break;
                } else if (operator.equals("*")) {
                    System.out.println("결과: " + (num1 * num2));
                    break;
                } else if (operator.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        System.out.println("결과: " + ((double)num1 / num2));
                    }
                    break;
                } else {
                    System.out.println("잘못된 연산 기호입니다. 다시 입력해주세요.");
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}
