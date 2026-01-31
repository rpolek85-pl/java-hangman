package pl.edu.agh.hangman;

import java.util.Random;

public class RandomWord {

    public String randomWord(String[] words){
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        return word;
    }
}
