package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class RandomWord {

    public String randomWord(List<String> words){
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        return word;
    }
}
