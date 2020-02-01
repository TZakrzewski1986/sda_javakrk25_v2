package pl.sda.javakrk25.day6.Ex_34;

public class Ex_34_fibonacci {

    /**
     * metoda, która wypisuje n-tą liczbę ciągu Fibonacciego
     * metoda, która zliczy sumę parzystch liczb ciągu Fibonacciego
     */

    public static void main(String[] args) {
        System.out.println(getFibonacciRecursive(5));
        System.out.println(getFibonacci(15));
        System.out.println(getSumOfEvenFibonacci(15));
    }


    public static int getFibonacciRecursive(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);     //można zapchać pamięć, bo
            // wszystkie petle muszą być całyczas otwarte, do puki nie zakończy przeliczania.
        }
    }


    private static int getFibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int fibonacci = 0;

        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default: {
                for (int i = 2; i <= n; i++) {
                    fibonacci = n1 + n2;
                    n1 = n2;
                    n2 = fibonacci;
                }
                return fibonacci;
            }
        }
    }


    private static int getSumOfEvenFibonacci(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int f = getFibonacci(i);
            if (f % 2 == 0) {
                sum += f;
            }
        }
        return sum;
    }
}
