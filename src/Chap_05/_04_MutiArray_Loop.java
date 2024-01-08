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
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}

        };

        for (int i = 0; i < 2; i++) { //세로
            for (int j = 0; j < 4; j++) {  //가로
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
    }
  }
