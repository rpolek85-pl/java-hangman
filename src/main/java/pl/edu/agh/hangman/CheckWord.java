package pl.edu.agh.hangman;

import java.util.List;

public class CheckWord {

    public static int getCheckWord(String word, List<String> guessedLetters) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if(guessedLetters.contains(String.valueOf(currentChar))) {
                guessedLetters.remove(currentChar);
            }
        }

        return guessedLetters.size();
    }
}


