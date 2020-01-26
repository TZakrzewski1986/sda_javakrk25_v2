package pl.sda.javakrk25.day6.Ex_17;

public class Ex_17_tax {

    /**
     * Napisać metodę, która obliczy należny podatek dla osób fizycznych.
     * Podatek liczymy na podstawie zasad:
     * do 26 roku życia 0% do I progu
     * dochód do 85528 (I próg) - podatek wynosi 17%
     * dochód powyżej 85528 (II próg)- podatek wynosi 17% z 85528 + 32% z nadwyżki
     */
    static final int AGE = 26;
    static final int MAX_VALUE = 85528;
    static final double TAX_RATE_ONE = 0.17;
    static final double TAX_RATE_TWO = 0.32;
    static final double TAX_FREE_AMOUNT = 3093;

    public static void main(String[] args) {
        double tax1 = getTax(60000, 32);
        System.out.printf("Tax to pay %.2f\n", tax1);
        double tax2 = getTax(60000, 23);
        System.out.printf("Tax to pay %.2f\n", tax2);
        double tax3 = getTax(247000, 32);
        System.out.printf("Tax to pay %.2f\n", tax3);
        double tax4 = getTax(247000, 23);
        System.out.printf("Tax to pay %.2f\n", tax4);
    }

    private static double getTax(double income, int age) {
        double incomeReduced = income - TAX_FREE_AMOUNT;
        double tierOneTax = getTaxOneTier(income, age);
        double tierTwoTax = getTaxTwoTier(income, age);
        return tierOneTax + tierTwoTax;
    }

    private static double getTaxOneTier(double income, int age) {
        double x = Math.min(MAX_VALUE, income);
        if (age > AGE) {
            return x * TAX_RATE_ONE;
        } else {
            return 0;
        }
    }

    private static double getTaxTwoTier(double income, int wiek) {
        double overIncome = income - MAX_VALUE;
        overIncome = Math.max(0, overIncome);
        return TAX_RATE_TWO * overIncome;
    }
}
