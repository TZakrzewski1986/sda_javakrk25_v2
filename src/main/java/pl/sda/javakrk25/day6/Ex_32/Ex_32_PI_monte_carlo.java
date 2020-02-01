package pl.sda.javakrk25.day6.Ex_32;

import java.util.Random;

public class Ex_32_PI_monte_carlo {

    /**
     * Oblicz przybliżenie liczby PI.
     */

    public static void main(String[] args) {
        long iloscProb = 0;
        long iloscTrafien = 0;
        Point center = new Point(1, 1);

        while (true) {
            Point p = getRandomPoint();
            iloscProb++;
            if (odleglosc(center, p) <= 1) {
                iloscTrafien++;
            }
            if (iloscProb % 100_000_000 == 0) {
                System.out.println(calculatePI(iloscProb, iloscTrafien));
            }
        }
    }

    private static double calculatePI(long iloscProb, long iloscTrafien) {
        return 4.0 * iloscTrafien / iloscProb;
    }

    private static Point getRandomPoint() {
        Random random = new Random();
        return new Point(random.nextDouble() * 2, random.nextDouble() * 2);
    }

    private static double odleglosc(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow(a.y - b.y, 2));
    }

    static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
