package part01.ch01_String;

import java.util.Scanner;

public class Main1157 {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'A']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = getAlphabetCount(str);
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                continue;
            }
            System.out.println((char)('A' + i) + " : " + count[i]);
        }
        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i< 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
            // maxCount에는 현재까지 가장 많이 등장한 알파벳의 '개수'가 들어있음
            // -> 근데 현재 카운트 값인 count[i]가 maxCount와 같다는 것은 가장 많이 사용된 알파벳이 여러 개 존재하는 경우이다
        }

        System.out.println(maxAlphabet);

    }
}
