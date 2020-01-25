package pl.sda.javakrk25.day6.Ex_5;

import java.util.Scanner;

public class Ex_5_bomb {

    public static void main(String[] args) throws InterruptedException {

        int secondsLeft = readUserInput();
        counter_for(secondsLeft);
    }

    private static void counter_for(int seconds) throws InterruptedException {
        for (int i = seconds; i > 0; i--) {
            System.out.printf("Pozostao %d sekund.\n", i);
            Thread.sleep(1000);
        }
        System.out.println("BOOOOOMMMM !!!!!!");
    }

    private static int readUserInput() {
        System.out.println("Ile sekund?");
        Scanner scanner = new Scanner(System.in);

        int result = -1;
        do {
            try {
                String input = scanner.next();
                result = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Błąd, podaj jeszcze raz!");
            }
        } while (result == -1);
        return result;
    }
}
