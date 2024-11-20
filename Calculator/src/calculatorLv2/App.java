package calculatorLv2;

import java.util.Scanner;

//
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        char symbol;

        while (true) {
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

            int result = calculator.calculate(num1, symbol, num2);
            System.out.println("계산결과 : " + result);

            while (true) {
                calculator.setArrayList(result);
                System.out.println("지금까지 저장된 결과: " + calculator.getResults());

                System.out.print("처음 저장된 결과를 삭제하겠습니까? (y / n) ");
                char choice = scanner.next().charAt(0);
                if (choice == 'y') {
                    calculator.removeResult();
                    break;
                } else if (choice == 'n') {
                    break;
                } else {
                    System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
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
