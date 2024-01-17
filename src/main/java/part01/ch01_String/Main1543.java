package part01.ch01_String;

import java.util.Scanner;

public class Main1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

//        int ans = 0;
//        int startIndex = 0;
//        while(true) {
//            int findIdx = doc.indexOf(word, startIndex);
//            if (findIdx < 0) {
//                break;
//            }
//            startIndex = findIdx + word.length();
//            ans++;
//        }

        String replaced = doc.replace(word, "");
        int ans = (doc.length() - replaced.length()) / word.length();
        System.out.println(ans);
    }
}
