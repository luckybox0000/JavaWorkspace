package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; //오전 10시

        // If 문 내에서 하나의 문장을 실행할때는 { } 없어도 가능
        if (hour <14)

           System.out.println("아이스 아메리카노 + 1");
        //if 문내에서 2개 이상의 문장을 실행할때는 { } 생략불가
        if (hour < 14 ) {

            System.out.println("아이스 아메리카노 + 1");

            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시이전, 모닝 커피를 마시지 않은 경우

        hour = 10;

        boolean morningcoffee = true ;

        if (hour < 14 && morningcoffee==false ) {

            System.out.println("아이스 아메리카노 + 1");

        }
        System.out.println("커피 주문 완료");


    }

}
