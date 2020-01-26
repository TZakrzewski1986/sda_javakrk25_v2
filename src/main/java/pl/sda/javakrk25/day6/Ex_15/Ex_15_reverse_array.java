package pl.sda.javakrk25.day6.Ex_15;

public class Ex_15_reverse_array {

    /**
     * odwrócić tablicę intów
     * wypisać połowę lementów
     * wypisać połowę elemenw od środkowego do pierwszego
     */

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : getReversedTable(input)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : getReverseTableSWAP(input)) {
            System.out.print(i + " ");
        }
        System.out.println();

        getHalfTable(input);
        System.out.println();
    }

    public static int[] getReversedTable(int[] arr1) {
        int[] result = new int[arr1.length];
        for (int i = arr1.length; i > 0; i--) {
            result[arr1.length - i] = arr1[i - 1];
        }
        return result;
    }

    public static int[] getReverseTableSWAP(int[] arr2) {
        int a;
        for (int i = 0; i < arr2.length / 2; i++) {
            a = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = a;
        }
        return arr2;
    }

    public static void getHalfTable(int[] arr3) {
        int x = arr3.length / 2;
        if (arr3.length % 2 != 0) {
            x++;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(arr3[i] + " ");
        }
    }


}
