package pl.edu.agh.hangman;

import java.util.List;

public class PrintHiddenWord {

    public static String getHiddenWord(String word, List<String> listLetter) {
        if (word == null) return "";

        StringBuilder hidden = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);

            String letterStr = String.valueOf(currentLetter);

            if (listLetter.contains(letterStr)) {
                hidden.append(currentLetter).append(" ");
            } else {
                hidden.append("_ ");
            }
        }

        return hidden.toString().trim();
    }
}