package pl.sda.javakrk25.day6.Ex_33;

import pl.sda.javakrk25.day6.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

public class Ex_33_wisielec {

    /**
     * Hasło: "Stokrotka"
     * Program wyświetla miesca pod hasło, użytkownik podaje literę, albo chasło, program sprawdza.
     */

    public static void main(String[] args) {
        String text = "stokrotka";
        String userInput = "";
        List<Character> userGuess = new ArrayList<>();
        String guess = "";

        do {
            show(userGuess, text);
            userInput = ScannerUtil.readUserInput();
            if (userInput.length() == 1 && !userGuess.contains(Character.valueOf(userInput.charAt(0)))) {
                userGuess.add(Character.valueOf(userInput.charAt(0)));
            }
        } while (!userInput.equals(text) && !userGuess.equals(text));

        for (int i = 0; i < userGuess.size(); i++) {
            guess = userGuess.remove(i).toString();
        }

        System.out.println("Gratuluję wygranej" + guess);
    }


    private static boolean show(List<Character> userGuess, String text) {
        boolean isAnnyCharUrevealed = false;
        for (char c :
                text.toCharArray()) {
            if (userGuess.contains(Character.valueOf(c))) {
                System.out.print(c);
            } else {
                isAnnyCharUrevealed = true;
                System.out.print("-");
            }
        }
        System.out.println();
        return !isAnnyCharUrevealed;
    }
}
