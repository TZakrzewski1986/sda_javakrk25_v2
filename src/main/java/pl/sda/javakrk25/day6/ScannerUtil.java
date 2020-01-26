package pl.sda.javakrk25.day6;

import java.util.Scanner;

public class ScannerUtil {

    public static int getNaturalNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.println("Provide number");
            n = scanner.nextInt();
        } while (n < 1);

        return n;
    }
}
