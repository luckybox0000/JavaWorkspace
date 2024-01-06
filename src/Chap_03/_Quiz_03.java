package Chap_03;

// "901231-1234567" 인경우 901231-1
// "030708-4567890" 인경우 030708-4

public class _Quiz_03 {
    public static void main(String[] args) {

        String id ="901231-1234567"; // 주민등록번호 13자리

        System.out.println(id.substring(0,8));//0위치부터 8위치 직전까지

        id ="030708-4567890"; // 주민등록번호 13자리

        System.out.println(id.substring(0,id.indexOf("-") +2 ));

    }
}
