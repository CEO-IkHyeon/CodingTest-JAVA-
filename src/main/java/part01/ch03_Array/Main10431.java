package part01.ch03_Array;

import java.util.Scanner;

public class Main10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N --> 0) {
            // 입력받기
            int T = sc.nextInt();
            int[] H = new int[20];
            for (int j = 0; j < 20; j++){
                H[j] = sc.nextInt();
            }
            /**
             * 직접 줄 세운 결과가 필요한 경우의 코드 (내가 작성)

            // 줄 세울 배열 선언
            int[] line = new int[20];
            int cnt = 0;
            line[0] = H[0];
            for (int i = 1; i < 20; i++) {
                // 현재 H[i]값이 line에서 제일 큰 경우
                boolean isTall = true;
                
                for (int j = 0; j < i; j++) {
                    // 내 앞에 나보다 큰 애 있을 때
                    if (line[j] > H[i]) {
                        // 나보다 큰 애부터 쭉 한발짝씩 뒤로 ㄱㄱ
                        for (int k = i; k > j; k--) {
                            line[k] = line[k-1];
                            cnt++;
                        }
                        line[j] = H[i];
                        isTall = false;
                        break;
                    }
                }
                // line에 있는 애들 중에 내가 제일 큰 경우 -> 현재 줄 맨 뒤에 서라
                if (isTall) line[i] = H[i];
            }
             *
             */


            /*이동 횟수만 알고 싶을 때*/
            // 사실 실제로 재배열할 필요 없고, 현재 값보다 큰 값이 현재 줄에 몇 명 서 있는지 알면 그 인원수만큼 뒤로 감
            int moveCount = 0;
            for (int i = 1; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (H[j] > H[i]) {
                        moveCount++;
                    }
                }
            }

            System.out.println(T + " " + cnt + " " +moveCount );
        }
    }
}
