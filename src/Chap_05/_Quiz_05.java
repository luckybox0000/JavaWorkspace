package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 신발사이즈는 250부터 295까지 5단위로 증가
        // 신발사이즈는 총 10까지

        // 사이즈 250 (재고있음)
        // 사이즈 255 (재고있음)
        //..

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length ; i++) {
            sizeArray[i] = 250 + (5* i);


        }
        for (int size :
                 sizeArray ) {
            System.out.println("신발사이즈 :  " + size + " (재고있음) ");
        }
    }
}
