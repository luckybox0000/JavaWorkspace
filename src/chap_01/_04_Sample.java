package chap_01;

import java.util.Scanner;


public class _04_Sample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.println("어떤 연산을 수행하시겠습니까? (+, -, *, /)");
        String operator = scanner.next();

        double result = 0;
        boolean isError = false;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    isError = true;
                }
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                isError = true;
                break;
        }

        if (!isError) {
            System.out.println("결과: " + result);
        }

        scanner.close();
    }
}

