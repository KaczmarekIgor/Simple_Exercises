package Exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int j = x.length();
        int w = 0; // 1 slowo
        int y = (j - 1); // ostatnie slowo

        for (int i = 0; i < j; i++) { // wypelnia
            if (x.charAt(i) != x.charAt(y)) { // zwraca znak
                w = 1;
                break;
            }
            y--;

        }
        if (w == 1) {
            System.out.println("nie jest");
        } else {
            System.out.println("Jest");
        }
    }
}
