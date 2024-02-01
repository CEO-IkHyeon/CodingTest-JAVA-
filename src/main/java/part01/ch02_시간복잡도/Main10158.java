package part01.ch02_시간복잡도;

import java.util.Scanner;

public class Main10158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt();


        int timeX = t % (2*w);
        int currentX = p;
        int dx = 1;
        while (timeX --> 0) {
            if (currentX == w) dx = -1;
            else if (currentX == 0) dx = 1;

            currentX += dx;
        }


        int timeY = t % (2*h);
        int currentY = q;
        int dy = 1;
        while (timeY --> 0) {
            if (currentY == w) dy = -1;
            else if (currentY == 0) dy = 1;

            currentY += dy;
        }

        System.out.println(currentX + " " + currentY);

    }
}