package pl.sda.javakrk25.day6.Ex_16;

public class Ex_16_temperature_converter {

    /**
     * Napisać metody, które przeliczają temperaturę z Celsjusza na Fahrenheita i odwrotnie
     */

    public static void main(String[] args) {
        double c = 39.5;
        double f = getF(c);
        System.out.printf("Temperatura %.2f Celsjusza to %.2f Fahrenheita\n", c, f);
        System.out.printf("Sprawdzenie przeliczenia, stopnie Celsjusza %.2f\n", getC(f));
    }

    public static double getF(double c) {
        double f = 1.8 * c + 32;
        return f;
    }

    public static double getC(double f) {
        double c = (f - 32) / 1.8;
        return c;
    }
}
