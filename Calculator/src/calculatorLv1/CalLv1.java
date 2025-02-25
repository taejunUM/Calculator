package calculatorLv1;

import java.util.Scanner;

public class CalLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1;
            int num2;
            char symbol;

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                num1 = scanner.nextInt();
                if (0 <= num1) {
                    break;
                } else {
                    System.out.println("0이상 양의 정수 값을 입력하세요.");
                }
            }

            while (true) {
                System.out.print("사칙연산 기호를 입력하세요 : ");
                symbol = scanner.next().charAt(0);
                if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                    break;
                } else {
                    System.out.println("잘못된 연산 기호입니다. 다시 입력해주세요.");
                }
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요 : ");
                num2 = scanner.nextInt();
                if (0 <= num2) {
                    break;
                } else {
                    System.out.println("0이상 양의 정수 값을 입력하세요.");
                }
            }

            if (symbol == '+') {
                System.out.println("결과: " + (num1 + num2));
            } else if (symbol == '-') {
                System.out.println("결과: " + (num1 - num2));
            } else if (symbol == '*') {
                System.out.println("결과: " + (num1 * num2));
            } else if (symbol == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    System.out.println("결과: " + ((double) num1 / num2));
                }
            }
            System.out.print("더 계산하시려면 아무 키나 입력해주세요. (exit를 입력하면 종료됩니다.) ");
            String exit = scanner.next();
            if (exit.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else {
                System.out.println("추가 계산을 시작합니다.");
            }
        }
    }
}
