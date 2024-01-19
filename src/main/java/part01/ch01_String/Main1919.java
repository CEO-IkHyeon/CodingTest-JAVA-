package part01.ch01_String;

import java.util.Scanner;
import java.math.*;
public class Main1919 {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'a']++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char[] arr1 = sc.next().toCharArray();
//        char[] arr2 = sc.next().toCharArray();
//
//        int[] cnt1 = new int[26];
//        int[] cnt2 = new int[26];
//
//        int ans = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            int idx = arr1[i]-'a';
//            cnt1[idx]++;
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            int idx = arr2[i]-'a';
//            cnt2[idx] += 1;
//        }
//
//
//        for (int i = 0; i < 26; i++) {
//            ans += (cnt1[i]-cnt2[i]) > 0 ? cnt1[i]-cnt2[i] : cnt2[i]-cnt1[i];
//        }


        String a = sc.next();
        String b = sc.next();
        int[] cnt1 = getAlphabetCount(a);
        int[] cnt2 = getAlphabetCount(b);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cnt1[i]-cnt2[i]);
        }

        System.out.println(ans);
    }
}
