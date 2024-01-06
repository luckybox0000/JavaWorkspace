package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        //반복문 Do While
        int distance = 25; //전체거리 25m
        int move = 0; //이동거리 0
        int height = 2;
        while (move + height < distance){
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착했습니다.");

        System.out.println("-----------#1__________");

        move = 0; //이동거리 0
        height = 25; //키가 25미터
        while (move + height < distance){
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착했습니다.");

        System.out.println("-----------#2__________");

        //Do While 반복문

        do {


            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동거리는 :" +move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");

    }
}
