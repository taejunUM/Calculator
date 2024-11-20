package calculatorLv2;

import java.util.ArrayList;

// 연산, 저장
public class Calculator {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public int calculate(int num1, char symbol, int num2) {
        int result = 0;

        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;
            }
        } else {
            throw new IllegalArgumentException("유효하지 않은 연산 기호입니다." + symbol);
        }
        return result;
    }

    // 결과 저장
    public void setArrayList(int result) {
        arrayList.add(result);
    }
    // 결과 조회
    public ArrayList<Integer> getResults() {
        return arrayList;
    }
    // 결과 삭제
    public void removeResult() {
        arrayList.remove(0);
    }

}
