package pl.sda.javakrk25.day6.Ex_12;

public class Ex_12_array_intersect {

    /**
     * Napisać metodę, która zwraca część wsolną z dwóch tablic.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {4, 5, 6, 7};
        int[] tabFinal = getIntersect(tab1, tab2);

        for (int i : tabFinal) {
            System.out.printf("%d ", i);
        }
    }

    private static int[] getIntersect(int[] tab1, int[] tab2) {
        int[] result = new int[0];
        for (int i : tab1) {
            for (int j : tab2) {

                if (i == j) {
                    result = ArrayUtil.addToEnd(result, i);
                }
            }
        }
        return result;
    }
}
