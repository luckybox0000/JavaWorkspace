package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문
        // 나코매장
        System.out.println("어서오세요. 나코입니다.");
        // 또 다른 사람이들어오면
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 아이이니다.");
        System.out.println("환영합니다. 아이이니다.");
        System.out.println("환영합니다. 아이이니다.");
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("----반복문 사용------");
        // 반복문 For 선언 조건 증감
        for (int i = 0; i < 10; i++) {
            //System.out.println("어서오세요. 나코입니다." +i);
            System.out.println("환영합니다. 코나입니다." + i);

        }

        // 짝수만 출력 For i 만 치면 엔터 ..자동완성
        // 0.2.4.6.8
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        // 홀수만 출력 For i 만출력
        // 13579
        for (int j = 1; j < 10; j += 2) {
            System.out.print(j);


        }

        // 거꾸로 숫자
        // 5 ,4, 3, 2, 1
    for (int j = 5; j > 0; j--) {

     System.out.print(j);

        }
        System.out.println();


    // 1부터 10까지의 합
    // 1+ 2 +3+4+5...10 합55
   int sum= 0;
        for (int i = 1; i <=10; i++) {
            sum +=i;
            System.out.println("현재까지의 총합은 "+sum+"입니다.");
        }
        System.out.println("1부터 10까지의 합은 " + sum +"입니다.");

  }

}

