package pl.sda.javakrk25.day6.Ex_31;

public class Ex_31_firstNumbers {

    /**
     * Metoda do sprawdzania, czy liczba jest liczbą parzystą.
     * Wypisać liczby pierwsze mniejsze od podanego n.
     */

    public static void main(String[] args) {
        System.out.println("Liczba 10: " + isPrime(10));

        //  printPrime(173);
        printMaxPrime(8474585);
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void printMaxPrime(int x) {
        for (int i = x; i > 2; i--) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
