package pl.sda.javakrk25.day6.Ex_30;

public class Ex_30_cesarsCypher {

    static final int OFFSET = 3;

    /**
     * Korzystając z szyfru Cezara naoisz metody do szyfrowania i deszyfrowania tekstu.
     */

    public static void main(String[] args) {
        String text = "We are the champion";
        System.out.println(encode(text));
        System.out.println(decode(encode(text)));
    }

    private static String encode(String content) {
        return shiftText(content, OFFSET);
    }

    private static String decode(String secret) {
        return shiftText(secret, -OFFSET);
    }

    private static String shiftText(String text, int shift) {
        char[] textArray = text.toCharArray();
        String encodedText = "";

        for (char c :
                textArray) {
            c += shift;
            encodedText += c;
        }

        return encodedText;
    }
}
