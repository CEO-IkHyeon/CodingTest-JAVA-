package part05.ch02_Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main_15649 {
    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M+1];
    }

    static int N, M;
    static int[] selected;


    static void rec_func(int k) {
        if (k == M+1) { // 다골랐다
            // selected[1...M] 배열이 새롭게 탐색된 결과
            // 문제에서는 다 골랐으면 출력하면 된다
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');

        } else {
            for (int cand = 1; cand <= N; cand++) {
                boolean isUsed = false;
                // 현재 고른 값(cand)가 지금까지 나열한 배열에 포함된 숫자라면 isUsed를 true로
                for (int i = 1; i < k; i++) {
                    if (cand == selected[i])
                        isUsed = true;
                }
                // 해당 숫자(cand)가 아직 사용된적 없다(=중복된적 없다)면 진행
                if (!isUsed) {
                    selected[k] = cand;
                    rec_func(k+1);
                    selected[k] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        input();
        
        // 1번째 원소부터 M번째 원소를 조건에 맞는 모든 방법을 찾아줘
        rec_func(1);
        System.out.println(sb.toString());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
