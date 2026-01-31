package pl.edu.agh.hangman;
import java.util.ArrayList;
import java.util.List;

public class Word {

    private final String word;
    private List<String> listLiter;
    public Word() {
        String[] listStr  = {"ada","ada"};
        RandomWord  rw = new RandomWord();
        this.word = rw.randomWord(listStr);
    }

    public String getWord() {
        return word;
    }

    public List<String> getListLiter() {
        return listLiter;
    }

    public int  getListLiterLength() {
        return listLiter.size();
    }

    public void addLetter(String letter) {
        this.listLiter.add(letter);
    }

    public String getHiddenWord(){
        PrintHiddenWord printHiddenWord = new PrintHiddenWord();
        String hiddenWord = printHiddenWord.getHiddenWord(this.word);
        return hiddenWord;
    }

}
