package pl.sda.javakrk25.day6.Ex_4;

public class Ex_4_wydawanie_kwoty {
    /**
     * Dostepne nominały: 5, 2, 1 monety oraz 50, 20, 10 banknoty 5, 2, 1 grosze
     * kwota do wydania 18zł 78 gr
     * W jakich nominałach to wydać y było jak najmniej monet?
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Dla ułatwienia kwote analizujemy w przeliczeniu na grosze.
         */

        int amountLeft = 1878;
        int[] availableCoins = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] usedCoins = new int[availableCoins.length];

        while (amountLeft > 0) {
            int indexOfCoin = findGreatestAvailabla(availableCoins, amountLeft);     // Znaleźć największy mozliwy
            // nominał

            int coin = availableCoins[indexOfCoin];
            amountLeft -= coin;       // zmniejszyć kwotę amountLeft
            usedCoins[indexOfCoin]++;       // zapisać użyte nominały
        }
    }

    private static void printOutTheResoukt(int[] availableCoins, int[] usedCoins) {
        for (int i = 0; i < availableCoins.length; i++) {
            int coin = availableCoins[i];
            int count = usedCoins[i];
            if (count == 0) continue;
            System.out.printf("%.2f x %d", coin / 100f, count);
        }
    }

    private static int findGreatestAvailabla(int[] availableCoins, int amountLeft) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < availableCoins.length; i++) {
            int coin = availableCoins[i];
            if (coin > max && coin <= amountLeft) {
                max = coin;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
