package pl.edu.agh.hangman;

public class PrintHiddenWord {

    public static String getHiddenWord(String word) {
        if (word == null) return "";

        StringBuilder hidden = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            hidden.append("_ ");
        }
        return hidden.toString();
    }
}