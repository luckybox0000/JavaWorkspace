package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됍니다. " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님, 배송이 완료돼었습니다.");

        // double는 실수함수

        double score = 90.5 ;

        // char 는 문자 한개

        char grade = 'A';
        name = "최예원";

        System.out.println( name + "님의 평균점수는 " + score + "입니다.");
        System.out.println( name + "님의 학점은"   + grade + "등급입니다.");

        boolean pass = true; // false

        System.out.println("이번 시험에 합격했을가요?" + pass);

        // 변수의 여러가지 형
        double d = 3.14123456789;
        float f = 3.14123456789f; // 위에 3.14를 너무 큰 변수를 정의 했기 때문에 f에 너무큰 수 변수를 뒤에 f를 정의

        System.out.println(d);
        System.out.println(f);
        //  21억범위 초과 int i  = 10000000000000;
        long l = 1000000000000l;
        l = 1_000_000_000_000l;

        System.out.println(l);
    }
}
