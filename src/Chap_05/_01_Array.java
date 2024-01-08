package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // 배열선언
//        String [] cofees = new String[4];

        //두번째 방법
        //String  coffes[] = new String[4];
//        cofees[0]="아메리카노"; //0부터 시작
//        cofees[1]="카페모카";
//        cofees[2]="라떼";
//        cofees[3]="카푸치노";
//
        //세번째 방법
//        String[] coffees =new String[] {"아메리카노","카페모카","라떼","카푸치노"};

        // 네번째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        //커피 주문
        System.out.println(coffees[0]+" 하나"); //아메리카노 하나
        System.out.println(coffees[1]+" 하나"); //카페모카 하나
        coffees[2]= "에스프레소"; // 값 변경
        System.out.println(coffees[2]+" 하나"); //라떼 하나
        System.out.println(coffees[3]+" 하나"); //카푸치노 하나
        System.out.println("주세요.");

        int[] i = new int[5];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        double [] d =new double[] {10.0, 11.2, 13.5};
        boolean [] b = new boolean[] {true,false,true};

    }
}
