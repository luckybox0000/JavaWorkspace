package chap_01;

/*
(실행결과)
상암08버스
약 3분 후 도착
남은 거리 1.2km
* */
public class _Quiz_01 {
    public static void main(String[] args) {
        //버스번호 상암버스08 1234
        String busNo= "상암08";

        // 도착 시간 (3분 5분)
        int minute = 3;
        // 남은 거리 (1.2 1.3 0.8)
        double distance = 1.2;

        System.out.println(busNo +"번 버스");
        System.out.println("약 " + minute +"분 후 도착");
        System.out.println("남은 거리  " + distance + "km");

    }
}
