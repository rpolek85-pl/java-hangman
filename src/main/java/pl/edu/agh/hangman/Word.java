package pl.edu.agh.hangman;
import java.util.List;

public class Word {

    private final String word;
    private List<String> listLiter;
    public Word() {
        this.word = "aaa";
    }

    public String getWord() {
        return word;
    }

    public List<String> getListLiter() {
        return listLiter;
    }

    public void addLetter(String letter) {
        this.listLiter.add(letter);
    }

    public String getHiddenWord(){
        return "____";
    }

}
