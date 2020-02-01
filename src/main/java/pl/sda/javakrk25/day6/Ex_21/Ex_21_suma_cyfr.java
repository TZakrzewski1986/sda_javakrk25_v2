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
        String liczba = setLiczba();
        System.out.printf("Suma cyfr podanej liczbt to: %d.\n", sum(liczba));
        System.out.printf("Suma cyfr parzystych to: %d, natomiast suma cyfr nieparzystych to: %d.\n",
                sumaParzystaINieparzysta(liczba, true), sumaParzystaINieparzysta(liczba, false));
        System.out.printf("Srednia arytmetyczna cyfr parzystych to: %d, natomiast cyfr nieparzystch to: %d.\n",
                srednia(liczba, true), srednia(liczba, false));
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
            suma += Integer.parseInt(Character.toString(cyfra[i]));
        }
        return suma;
    }

    private static int sumaParzystaINieparzysta(String liczba, Boolean CzyParzysta) {
        int sumaParzysta = 0;
        int sumaNieparzysta = 0;
        int cyfra;
        char[] cyfraChar = liczba.toCharArray();

        for (int i = 0; i < cyfraChar.length; i++) {
            cyfra = Integer.parseInt(Character.toString(cyfraChar[i]));
            if (cyfra % 2 == 0) {
                sumaParzysta += cyfra;
            } else {
                sumaNieparzysta += cyfra;
            }
        }

        if (CzyParzysta) {
            return sumaParzysta;
        } else {
            return sumaNieparzysta;
        }
    }

    private static int srednia(String liczba, Boolean CzyParzysta) {
        int parzyste = 0;
        int nieparzyste = 0;
        int cyfra;
        char[] cyfraChar = liczba.toCharArray();

        for (char c : cyfraChar) {
            cyfra = Integer.parseInt(Character.toString(c));
            if (cyfra % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
        }
        int sredniaParzyste = Math.round(sumaParzystaINieparzysta(liczba, true) / parzyste);
        int sredniaNieparzysta = Math.round(sumaParzystaINieparzysta(liczba, false) / nieparzyste);

        if (CzyParzysta) {
            return sredniaParzyste;
        } else {
            return sredniaNieparzysta;
        }
    }

}
