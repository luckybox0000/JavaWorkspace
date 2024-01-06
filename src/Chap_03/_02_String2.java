package Chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String  s = "I like Java and Python and C.";


        //문자열 변환
        System.out.println(s.replace("and" , ",")); //and를 , 로변환
        System.out.println(s.substring(7)); //index 기준 7번째부터 끝까지 반환 (참고)..s변수의 변환 결과가 반영X
        System.out.println(s.substring(s.indexOf("Java"))); //앞과동일
        //"Java" 가 시작하느 위치부터 , "." 이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //시작 위치부터 끝위치 "직전

        // 공백 제거

        s = "          I love Java";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열의 결합

        String s1 = "Java";
        String s2 = "Python";
        String s3 = s1 + s2;
        System.out.println(s3); // JavaPython 출력
        System.out.println(s1.concat(".").concat(s2)); // 결합..Java.Python

    }
}
