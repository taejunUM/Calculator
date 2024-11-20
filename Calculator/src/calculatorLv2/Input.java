package calculatorLv2;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int inputNum() {
        int num1;
        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            num1 = scanner.nextInt();
            if (0 <= num1) {
                return num1;
            } else {
                System.out.println("0이상 양의 정수 값을 입력하세요.");
            }
        }
    }

    public char inputSymbol() {
        char symbol;
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요 : ");
            symbol = scanner.next().charAt(0);
            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                return symbol;
            } else {
                System.out.println("잘못된 연산 기호입니다. 다시 입력해주세요.");
            }
        }
    }
}
