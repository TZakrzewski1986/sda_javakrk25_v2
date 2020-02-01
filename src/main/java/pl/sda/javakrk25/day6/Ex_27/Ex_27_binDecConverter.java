package pl.sda.javakrk25.day6.Ex_27;

public class Ex_27_binDecConverter {

    /**
     * Napisać metody konwertujące pomiędzy systemem binarnym i dziesiętnym.
     */

    public static void main(String[] args) {
        int decimalValue = binaryStringToDecimalInt("1010111");
        String originalBinary = numberToBinaryString(decimalValue);
        System.out.println(originalBinary);
    }

    private static String numberToBinaryString(int decimalValue) {
        String output = "";
        do {
            output = (decimalValue % 2) + output;
            decimalValue /= 2;
        } while (decimalValue != 0);
        return output;
    }

    private static int binaryStringToDecimalInt(String str) {
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
