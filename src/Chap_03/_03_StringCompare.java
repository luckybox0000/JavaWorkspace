package Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //같은면 true , 틀리면 false 반환
        System.out.println(s2.equals("pythson")); //대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분없음

        // 문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";

        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1==s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2); //false (참조)
    }
}