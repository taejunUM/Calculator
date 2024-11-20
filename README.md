# Calculator
1.	사칙연산 수행
	•	사용자 입력으로 두 숫자와 연산 기호를 받아 사칙연산(+, -, *, /)을 수행합니다.
	•	나눗셈 연산 시, 0으로 나눌 경우 에러 메시지를 출력합니다.
	2.	결과 저장 및 조회
	•	계산 결과를 리스트에 저장합니다.
	•	지금까지 저장된 모든 결과를 조회할 수 있습니다.
	3.	결과 삭제
	•	리스트의 첫 번째 결과를 삭제할 수 있는 옵션을 제공합니다.
	4.	종료 및 추가 연산
	•	사용자가 “exit”를 입력하면 프로그램이 종료됩니다.
	•	다른 입력값을 제공하면 추가 계산을 수행합니다.

# App
    • main 메서드
    •	Input 클래스와 Calculator 클래스를 사용하여 계산 및 결과 관리를 수행.
	•	사용자와 상호작용하며 반복적인 계산과 결과 관리 루프를 처리.

# Input
	•	사용자 입력을 처리하는 클래스.
	•	숫자 입력(inputNum)과 연산 기호 입력(inputSymbol)을 처리.
	•	입력값 검증(음수 숫자 및 잘못된 연산 기호에 대한 검증)을 수행.

# Calculator
    •	계산 로직(calculate)을 처리.
	•	계산 결과를 저장(setArrayList), 조회(getResults), 삭제(removeResult)할 수 있는 메서드 제공.

# 사용 방법
	1.	App 클래스의 main 메서드를 실행합니다.
	2.	프롬프트에 따라 두 숫자와 연산 기호를 입력합니다.
	3.	결과가 출력되며, 저장된 결과를 조회하거나 삭제할 수 있습니다.
	4.	“exit”을 입력하면 프로그램이 종료됩니다.

