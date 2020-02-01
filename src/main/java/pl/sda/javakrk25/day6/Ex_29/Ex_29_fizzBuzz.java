package pl.sda.javakrk25.day6.Ex_29;

public class Ex_29_fizzBuzz {

    /**
     * Symulacja gry w Fizz&Buzz
     */

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
