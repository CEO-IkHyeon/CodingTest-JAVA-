package part01.ch01_String;

import java.util.Scanner;

public class Main13223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1 = sc.next();
        String time2 = sc.next();
        String[] current = time1.split(":");
        String[] drop = time2.split(":");

        int totalCurrent = Integer.parseInt(current[0]) * 3600 + Integer.parseInt(current[1]) * 60 + Integer.parseInt(current[2]);
        int totalDrop = Integer.parseInt(drop[0]) * 3600 + Integer.parseInt(drop[1]) * 60 + Integer.parseInt(drop[2]);

        int timeDiff = totalDrop - totalCurrent;
        if (timeDiff <= 0) {
            timeDiff += 24 * 3600;
        }

        int hour = timeDiff/3600;
        int minute = (timeDiff % 3600) / 60;
        int second = timeDiff % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute,second);


    }
}
