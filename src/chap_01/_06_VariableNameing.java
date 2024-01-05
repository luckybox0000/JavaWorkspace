package chap_01;

public class _06_VariableNameing {
    public static void main(String[] args) {

        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용가능, (공백사용불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자
        // 6.예약어 사용불가 (public static Double float int ......)


        // 다른 나라가는데 필요한 입국 신고서

        String nationality = "대한민국"; //국적
        String firstName ="예원";  // 이름
        String lastName = "최";  // 성
        String dateOfBirth = "2001-12-30"; //생년월일
        String residentialAddress = "롯데호텔"; // 체류지
        String purposeOfVisit = "여행"; //입국목적
        String flightNo = "KE657";  // 편명
        String _flightNo ="KE657"; // 항공 편명
//        String -flightNo ="KE657";  // -하이픈 사용안됌

        int accompany = 2; //동반 가족수
        int length_Of_Stay = 5 ; // 체류일자

        String item1 = "시계";
        String item2 = "양주";
//        String 3item3 = "양주"; // 변수명에 첫문자는 숫자가 X
        String item3 = "담배";


        // 프로그램의 흐름을 위해 사용돼는 경우 ....등 짧게...
        int i = 1;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로

        final String CODE ="KR";
//        CODE = "US";  // 상수는 변할수 없다
    }
}
