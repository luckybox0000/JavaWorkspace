package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If else
        int hour = 10;
        if ( hour < 14) {  //2시이전이면 주문

            System.out.println("아이스 아메리카노 + 1");

        } else {
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #1");
        // 오후 2시 이후거나 모닝커피를 마신 경우
         hour = 10;
         boolean morningCoffee = false;
         if (hour> 14 || morningCoffee) {
             System.out.println("아이스 아메리카노 (디카페인) + 1" );
             System.out.println("커피 주문 완료 #2");
         } else { // 그외의 경우이면

             System.out.println("아이스 아메리카노 + 1 ");
             System.out.println("커피 주문 완료 #3");
         }

         }
    }

