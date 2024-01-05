package chap_01;

public class _08_TypeCasting {

    public static void main(String[] args) {
        // 형 변환  TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float ..double
        int score = 93 ;

        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        //float double to int

        float score_f = 93.3F ;
        double score_d = 98.8;
        System.out.println(score_f);
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // 정수 + 실수 연산

        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191
        score_d = 93 + 98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기

        double convertedScoreDouble = score;

        System.out.println(convertedScoreDouble);

        // int long float ...> double 자동으로 형변환

        int convertedScoreInt = (int)score_d;

        // double ....> int long float ..수동으로 변환

        // 숫자를 문자열로

        String s1 = String.valueOf(93)  ;
        s1 = Integer.toString(93); //93

        String s2 = String.valueOf(98.8);
        System.out.println(s2);

        System.out.println(s1);

        // 문자열을 숫자로

        int i = Integer.parseInt("93");

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // 오류 문자열이 입력돼서 int error = Integer.parseInt("자바");

    }
}
