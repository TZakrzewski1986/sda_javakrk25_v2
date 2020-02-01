package pl.sda.javakrk25.day6.Ex_28;

public class Ex_28_DistanceBetweenPoint {

    /**
     * Napisać program, który:
     * a) oblicza odległość między dwoma punktami w układzie współrzednych
     * b) wyszukuje najbliższy i najdalszy punkt od podanego
     */

    public static void main(String[] args) {
        Point[] points = {new Point(2, 5), new Point(4, -3), new Point(-5, -7), new Point(-1, 0)};
        Point a = new Point(1, 1);
        Point b = new Point(5, 4);

        System.out.printf("Odległość między punktami wynosi %.2f\n", odleglosc(a, b));

        Point closest = closest(points, b);
        System.out.printf("Closest point to b is : %.2f, %.2f\n", closest.x, closest.y);
        Point farest = farest(points, b);
        System.out.printf("Njadalszy punkt dl punktu b to: %.2f, %.2f", farest.x, farest.y);
    }

    private static double odleglosc(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow(a.y - b.y, 2));
    }

    private static Point closest(Point[] points, Point refPoint) {
        double mniDistance = Double.MAX_VALUE;
        Point closestPoint = null;
        for (Point p :
                points) {
            double distnce = odleglosc(p, refPoint);
            if (mniDistance > distnce) {
                mniDistance = distnce;
                closestPoint = p;
            }
        }
        return closestPoint;
    }

    private static Point farest(Point[] points, Point refPoint) {
        double maxDistance = 0;
        Point farestPoint = null;
        for (Point p :
                points) {
            double distnce = odleglosc(p, refPoint);
            if (maxDistance < distnce) {
                maxDistance = distnce;
                farestPoint = p;
            }
        }
        return farestPoint;
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
