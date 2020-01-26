package pl.sda.javakrk25.day6.Ex_20;

import pl.sda.javakrk25.day6.ScannerUtil;

public class Ex_20_potęgowanie_liczb {

    /**
     * Program wczytuje od użytkownika liczbę całkowitą n,następnie wyświetla wszystkie potęgi liczby 2, nie większe
     * niż podana liczba.
     */

    public static void main(String[] args) {
        int number = ScannerUtil.getNaturalNumber();
        printPowers(number);
    }

    private static void printPowers(int number) {
        int x = 0;

        while (Math.pow(2, x) < number) {
            System.out.printf("Dwa do potęgi %d = %d.", x, Math.pow(2, x));
            x++;
        }
    }
}
