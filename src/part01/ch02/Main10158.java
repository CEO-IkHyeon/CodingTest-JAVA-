package part01.ch02;

import java.util.Scanner;

public class Main10158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt();

        int deltaX = 1;
        int deltaY = 1;
        
        // 주기가 24시간 -> 24시간 tracking 해서 배열에 저장해놓고 꺼내쓰자 -> 시간복잡도 O(24) -> O(1)
        int[][] path = new int[25][2];
        path[0] = new int[]{p, q};

        for (int i = 0; i < 24; i++) {
            if (p == w || p == 0) {
                deltaX = -deltaX;
            }
            if (q == h || q == 0) {
                deltaY = -deltaY;
            }
            p += deltaX;
            q += deltaY;
            path[i+1] = new int[]{p,q};
        }

        t %= 24;
        System.out.printf("%d %d", path[t][0], path[t][1]);

        //wrong
    }
}
