package pl.edu.agh.hangman;

import java.util.List;

public class CheckGameWord {

    public static int countWrongLetters(String word, List<String> guessedLetters) {

        int wrongCountLetter = 0;

        for (String letter : guessedLetters) {
            if (!word.contains(letter)) {
                wrongCountLetter++;
            }
        }
        return wrongCountLetter;
    }

    public static boolean checkWin(String word, List<String> guessedLetters) {
        for (char c : word.toCharArray()) {
            if (!guessedLetters.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }


}


