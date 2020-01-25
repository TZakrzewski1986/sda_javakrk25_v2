package pl.sda.javakrk25.day6;


public class Ex_1_printing_shapes {

    /**
     * Używając symbolu #, wypisz w konsoli kształty: kwadrat, prójką prostokątny, trójkąt równoramienny
     *
     * @param args
     */
    public static void main(String[] args) {
        square(10);
        triangle(10);
        triangle2(10);
        triangle3(11);
        triangle4(11);
    }

    private static void square(int size) {
        for (int i = 0; i < size; i++) {           //przejście poszczególnych linii
            for (int j = 0; j < size; j++) {       //przejście po kolejnych kolumnach
                System.out.print(" # ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j) {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle2(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle3(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (((size - i - 1) <= j) && (i >= j)) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle4(int size) {
        int half = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (((size - i - 1) <= j)) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
