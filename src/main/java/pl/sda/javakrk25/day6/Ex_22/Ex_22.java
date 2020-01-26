package pl.sda.javakrk25.day6.Ex_22;

import java.util.Scanner;

public class Ex_22 {

    /**
     * Program wczytuje od użytkownika dowly tekst, następnie zlicza ilość wystąpień ostatniej litery.
     */

    public static void main(String[] args) {
        String input = readUserInput().trim().toLowerCase();

        char c = getLastLetter(input);

        int reps = countLetters(input, c);
        System.out.println("Ostatni aliter wystąpiła w tekście " + reps);
    }

    private static String readUserInput() {
        System.out.println("Hello, please provide text: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int countLetters(String input, char c) {
        char[] letters = input.toCharArray();
        int counter = 0;
        for (char i : letters) {
            if (c == i) {
                counter++;
            }
        }
        return counter;
    }

    private static char getLastLetter(String input) {
        char[] check = input.toCharArray();
        for (int i = check.length; i > 0; i--) {
            if (Character.isLetter(check[i])) {
                return check[i];
            }
        }
        return ' ';
    }
}
