package pl.edu.agh.hangman;
import java.util.ArrayList;
import java.util.List;

public class GameWord {

    private final String word;
    private List<String> listLiter;
    public GameWord() {
        ConvertWord cw = new ConvertWord();
        RandomWord rw = new RandomWord();
        String newWord = rw.randomWord(cw.readWordsFromFile());
        this.word = newWord;
        this.listLiter = new ArrayList<>();
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

    public int worngLetterNumber() {
        CheckGameWord checkGameWord = new CheckGameWord();
        return checkGameWord.countWrongLetters(word,listLiter);
    }

    public String getHiddenWord(){
        PrintHiddenWord printHiddenWord = new PrintHiddenWord();
        String hiddenWord = printHiddenWord.getHiddenWord(word, listLiter);
        return hiddenWord;
    }

    public boolean checkWin(){
        CheckGameWord checkGameWord = new CheckGameWord();
        return checkGameWord.checkWin(word, listLiter);
    }
}
