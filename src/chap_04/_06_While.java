package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        // 수영장에서 수영을 하는 모습
        int distance =25; //전체거리 25m
        int move = 0; // 현재 이동거리 0m
        while (move < distance) { // 현재이동거리가 전체 이동 거리보다 작을때
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 "+ move);
            move += 3 ; //3미터 이동


        }
        System.out.println("도착하였습니다.");

        move = 0;
        // 무한 루프
        move = 0; // 현재 이동거리 0m
        while (move < distance) { // 현재이동거리가 전체 이동 거리보다 작을때
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 " + move);
            move += 3; //3미터 이동
        }

    }
}
