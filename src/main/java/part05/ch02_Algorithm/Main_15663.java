package part05.ch02_Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15663 {
    static StringBuilder sb = new StringBuilder();
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();

        numbers = new int[N+1];
        used = new int[N+1];

        int cnt = 1;
        for (int i = 1; i <= N; i++) {
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);

        selected = new int[M+1];
    }

    static int N, M;
    static int[] selected, used;

    static int[] numbers;
    static void rec_func(int k) {

        // 다 골랐을 때 -> 출력
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            int last_cand = 0;
            for (int cand = 1; cand <= N; cand++) {
                if (used[cand] == 1) continue;
                if (numbers[cand] == last_cand) continue;

                last_cand = numbers[cand];
                selected[k] = numbers[cand];
                used[cand] = 1;

                rec_func(k+1);

                selected[k] = 0;
                used[cand] = 0;
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
