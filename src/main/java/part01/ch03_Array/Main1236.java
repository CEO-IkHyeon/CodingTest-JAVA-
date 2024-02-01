package part01.ch03_Array;

import java.util.Scanner;

public class Main1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        boolean[] existRow = new boolean[n];
        boolean[] existCol = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'X') {
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }

        int remainRow = n;
        int remainCol = m;

        for (int i = 0; i < n; i++) {
            if (existRow[i]) remainRow--;
        }
        for (int i = 0; i < m; i++) {
            if (existCol[i]) remainCol--;
        }

        System.out.println(Math.max(remainRow, remainCol));

        // 1. 몇 개의 행에 경비원 있는지
        int existRowCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'X') {
                    existRowCount++;
                    break;
                }
            }
        }
        // 2. 몇 개의 col에 경비원 있는지
        int existColCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[j][i] == 'X') {
                    existColCount++;
                    break;
                }
            }
        }


        int needRowCount = n - existRowCount;
        int needColCount = m - existColCount;


        System.out.println(Math.max(needRowCount, needColCount));
    }
}
