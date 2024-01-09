package Chap_05;

public class _04_MutiArray_Loop {
    public static void main(String[] args) {

        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "C3", "D4"},
                {"C1", "C2", "C3", "C4"}

        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seats[i][j] + " ");

            }
            System.out.println();


        }

        System.out.println("----------------------");


        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}

        };

        for (int i = 0; i < seats2.length; i++) { //세로
            for (int j = 0; j < seats2[i].length; j++) {  //가로
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        // 세로 크기 10 x 가로크기 15 인 해당하는 영화관 좌석
        String [][] seats3 = new String[10][15];
        String[] eng ={"A","B","C","D","E","F","G","H","I","J"};

        for (int i = 0; i < seats3.length ; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);

            }
        }

        //표 구매
        seats3[7][8] ="__"; //H9
        seats3[7][9] ="___"; //H10
        // 영화관 좌석 번호 확인

        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) {  //가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

    }
  }
