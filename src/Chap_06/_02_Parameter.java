package Chap_06;

public class _02_Parameter {
    public static void power(int number){ //매개변수 number
        int result = number * number;
        System.out.println(number + " 의 2 승은" + result);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
                   }
        System.out.println(number + " 의 "+ exponent+ "승은" + result);
    }
    public static void main(String[] args) {
        //파라미터 //전달값
        // 2 ----> 2 * 2 = 4
        // 3 ----> 3 * 3 = 9


        //Argument 인수
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9
        powerByExp(16,2);
    }
}
