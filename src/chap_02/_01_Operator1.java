package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        // 산술연산자

        // 일반연산자

        System.out.println(1 + 2); // 3
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); //2.5 ---> 2
        System.out.println(2 / 4); //0.5 --->0
        System.out.println(4 % 2); //나머지를 구하는거


        //우선 순위 연산

        System.out.println(2 + 2 * 2); //곱하기 우선 6
        System.out.println((2 + 2) * 2); //괄호 우선 8
        System.out.println((2 + 2) * 2); //괄호 우선 8

        //변수를 사용한 연산

        int a = 20;
        int b = 10;
        int c;

        c = a + b ;

        System.out.println(c); //30

        c= a - b;

        System.out.println(c); //10

        c = a * b ;

        System.out.println(c); // 200

        c = a % b ;

        System.out.println(c); //0


        // 증감 연산 ( ++ , --)

        int val ;
        val = 10 ;

        System.out.println(++val); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11


        val =15 ;

        System.out.println(--val); //14 먼저빼고 출력
        System.out.println(val); //14 그대로 위에거 출력
        System.out.println(val--); //14 출력하고 빼고
        System.out.println(val); // 13 뺀게 출력

        // 은행 대기표

        int waiting = 0;

        System.out.println("대기 인원 : " + waiting ++); //대기 인원 : 0
        System.out.println("대기 인원 : " + waiting ++); //대기 인원 : 1
        System.out.println("대기 인원 : " + waiting ++); //대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); //총대기 인원 : 3

            }

}
