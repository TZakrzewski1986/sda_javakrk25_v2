package pl.sda.javakrk25.day6.Ex_19;

import pl.sda.javakrk25.day6.ScannerUtil;

public class Ex_19_sumowanie {

    /**
     * Program, który pobiera od użytkownika dwie liczby (A,B)
     * a następnie liczy sumę liczb pomiędzy A i B.
     */

    public static void main(String[] args) {
        int A = ScannerUtil.getNaturalNumber();
        int B = ScannerUtil.getNaturalNumber();

        System.out.println(sumInRange(A, B));

    }

    private static int sumInRange(int A, int B) {
        if (A > B) {
            return sumInValideRange(B, A);
        } else {
            return sumInValideRange(A, B);
        }
    }

    private static int sumInValideRange(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        return sum;
    }
}
