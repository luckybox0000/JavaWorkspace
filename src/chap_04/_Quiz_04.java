package chap_04;


// 주차요금은 시간당 4000원 (일일 최대 요금은 30000 원)
// 경차 또는 장애인 차량은 최종 요금에서 50 % 할인

//일반 차량은 5시간 주차시 20000원
// 경차 5시간 주차시 10000 원
//장애인 차량 10시간 주차시 15000원

// 실행결과 : 주차 요금은 xx 입니다.
public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        boolean isSmallCar = false; //경차 여부
        boolean withDisablePerson = true; //장애인 차량

        int fee = hour * 4000; //시간당 40000

        //3000원 초과시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000; //일일 최대요금

        }
        //경차 또는 장애인 차량인 경우 50 할인
        if (isSmallCar || withDisablePerson ){
            fee /=2; //50% 할인 적용

        }
        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
