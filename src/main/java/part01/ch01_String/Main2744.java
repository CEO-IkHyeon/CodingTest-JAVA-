package part01.ch01_String;

import java.util.Scanner;

public class Main2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        char[] array = str.toCharArray();
//        int len = array.length;
//
//        for(int i = 0; i < len; i++) {
//            if (array[i] >= 65 && array[i] <= 90) {
//                array[i] += 32;
//            } else {
//                array[i] -= 32;
//            }
//        }
//        str = new String(array);
//        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                System.out.print((char)('a' + ch - 'A'));
            } else {
                System.out.print((char)('A' + ch - 'a'));
            }
        }
    }
}
