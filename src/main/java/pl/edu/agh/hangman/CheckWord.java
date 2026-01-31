package pl.edu.agh.hangman;

import java.util.List;

public class CheckWord {

    public static String getCheckWord(String word, List<Character> guessedLetters) {
        if (word == null || guessedLetters == null) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (guessedLetters.contains(currentChar)) {
                result.append(currentChar).append(" ");
            } else {
                result.append("_ ");
            }
        }

        return result.toString().trim();
    }
}


