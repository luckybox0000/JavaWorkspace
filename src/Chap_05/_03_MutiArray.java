package Chap_05;

public class _03_MutiArray {
    public static void main(String[] args) {
        // 다차원 배열(2차원배열

        //소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        // 3 X 4 크기의 2차원 배열

        String[] seatA= {"A1","A2","A3","A4"} ;
        String[] seatB= {"B1","B2","C3","D4"} ;
        String[] seatC= {"C1","C2","C3","C4"} ;

        String [][] seats = new String[][] {
                {"A1","A2","A3","A4"},
                {"B1","B2","C3","D4"},
                {"C1","C2","C3","C4"}

        };
        // B2에 접근 할려면 ?
        System.out.println(seats[1][1]);
        // C4에 접근 할려면?
        System.out.println(seats[2][3]);

        // 앞줄에는 3칸 둘째 줄에는 4칸 셋째줄에는 5칸

        String [][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}

        };
        //A3 접근
        System.out.println(seats2[0][2]);
        //A4에 접근
        //System.out.println(seats2[0][4]);

        // 3차원 배열 만들기

        String[][][] marray =new String [][][]{

                {{},{},{}},
                {{},{},{}},
                {{},{},{}},
                {{},{},{}},
        };
    }
}
