package chap_04;

public class _011_Continue {
    public static void main(String[] args) {

        // Continue 문
        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // for

        int max =20; // 최대 치킨 판매 수량
        int sold = 0; //현재 치킨 판매 수량
        int noShow = 17; // 대기번호 노쇼손님

        for (int i = 1; i <=50 ; i++) {
            System.out.println(i + "번 손님,주문하신 치킨 나왔습니다.");
            // 손님이 없다면

            if (i ==noShow) {
                System.out.println(i+"번 손님, 노쇼로 인해 다음손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold ++;  // 판매처리


            if (sold == max) {
                System.out.println("금일 재료가 모두 소진돼었습니다.");
                break;
            }
        }
        System.out.println("금일 영업을 종료합니다");

        //While 문
        sold = 0;
        int index = 1; //주문번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면
            if (index==noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index ++;
                continue;
            }

            sold ++; // 판매 처리

            if (sold == max){
                System.out.println("금일 재고가 모두 소진돼었습니다.");
                break;
            }
            index ++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
