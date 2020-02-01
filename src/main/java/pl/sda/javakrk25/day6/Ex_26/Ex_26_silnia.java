package pl.sda.javakrk25.day6.Ex_26;

public class Ex_26_silnia {

    /**
     * Napisz funkcję, ktora liczy silnię z podanego parametru.
     */

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    private static long factorial(int n) {
        long factorisl = 1;
        for (int i = 1; i <= n; i++) {
            factorisl *= i;
        }
        return factorisl;
    }
}
