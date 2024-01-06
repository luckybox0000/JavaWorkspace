package chap_04;

public class _04_SwichCase {
    public static void main(String[] args) {
        // Swich Case


        // 석차에 따른 장학금 지급
        // 1등 하면 전액 장학금
        // 2등 하면 반액 장학금
        // 3등 하면 반액 장하금
        // 그외에는 : 장학금 대상이 아님

        int ranking = 1; // 1등

        // if else 문을 이용 (범위의 값을 이용할때)
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액장학금");

        } else {

            System.out.println("장학금 대상이 아닙니다.");

        }
        System.out.println("조회가 완료#1");


        // swich case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 2;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다");
        }
        System.out.println("조회 완료 #2");


        // case 2 와 3 합침
        ranking = 3;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다");
        }
        System.out.println("조회 완료 #3");

        //중고 상품의 ㄷ3등급에 따른 가격을 책정 (1급 : 최상급 , 4급 :최하위)
        int grade = 1 ; // 등급
        int price = 7000; //기본 가격

        switch (grade){
            case 1 :
                price += 1000; //price=price +1000
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;

        }
        System.out.println(grade +"등급의 제품의 가격 : " + price + "원입니다." );
    }
}
