package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {

        String  s = "I like Java and Python and C.";
        System.out.println(s);

        //문자의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환

        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계

        System.out.println(s.contains("Java")); //포함돼면 true 미포함이면 false
        System.out.println(s.contains("C#")); //포함돼면 true 미포함이면 false
        System.out.println(s.indexOf("Java")); //몇번째인지 참고로 자바는 0부터시작
        System.out.println(s.indexOf("C#")); //포함안하면 ..-1
        System.out.println(s.lastIndexOf("and")); //중복됀거 두번째 위치
        System.out.println(s.startsWith("I like")); // 처음시작이 맞으면 true,틀리면 false 반환
        System.out.println(s.endsWith(".")); //true 마지막이 . 로 끝나서 반환

    }
}
