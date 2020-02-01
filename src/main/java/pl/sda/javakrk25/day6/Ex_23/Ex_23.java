package pl.sda.javakrk25.day6.Ex_23;

public class Ex_23 {

    /**
     * Zdefiniować funkcję int strToInt(String str) , która zamienia liczbę całkowitą zapisaną w postaci
     * łańcucha na liczbę całkowitą typu int. Funkcja powinna przerywać konwersję w momencie napotkania
     * pierwszego znaku nie należącego do zapisu liczby, zatem np. dla strToInt("-13krowa") wynikiem powinno być -13
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(strDecToIntDec("13"));
        System.out.println(strBinaryToIntDec("1010"));
        System.out.println(anyStringToInt("-362526373lovekrove"));
    }

    private static int anyStringToInt(String str) {
        String digits = "";
        int liczba = 0;

        char[] chars = str.toCharArray();

        for (char c :
                chars) {
            if (Character.isDigit(c)) {
                digits += c;
            }
            liczba = strDecToIntDec(digits);

        }
        if (str.startsWith("-")) {
            return 0 - liczba;
        } else {
            return liczba;
        }
    }


    private static int strDecToIntDec(String str) {
        int i = 0;
        int exp = 0;
        int number = 0;

        char[] digits = str.toCharArray();
        exp = digits.length - 1;

        for (char c :
                digits) {
            i = Integer.parseInt(Character.toString(c));
            number += Math.pow(10, exp) * i;

            exp--;
        }
        return number;
    }

    private static int strBinaryToIntDec(String str) {
        int i = 0;
        int exp = 0;
        int number = 0;

        char[] digits = str.toCharArray();
        exp = digits.length - 1;

        for (char c :
                digits) {
            i = Integer.parseInt(Character.toString(c));
            number += Math.pow(2, exp) * i;

            exp--;
        }
        return number;
    }

}
