package pl.sda.javakrk25.day6.Ex_21;

import java.util.Scanner;

public class Ex_21_suma_cyfr {

    /**
     * Pobieramy liczbe od użytkownika
     * obliczamy sumę cyfr
     * obliczmy osobno sumę cyfr pazystych i nieparzystych
     * obliczmy stosunek sredniej arytmetycznej liczb parzystych od nieparzystych
     */

    public static void main(String[] args) {

        System.out.printf("Suma cyfr podanej liczbt to: %d.", sum(setLiczba()));
    }

    private static String setLiczba() {
        String number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        return number = scanner.next();
    }

    private static int sum(String liczba) {
        int suma = 0;
        char[] cyfra = liczba.toCharArray();

        for (int i = 0; i < cyfra.length; i++) {
            suma += cyfra[i];
        }
        return suma;
    }
}
