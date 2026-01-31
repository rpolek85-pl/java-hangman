package pl.edu.agh.hangman;

public class PlayHangmanGame {
    public void playHangmanGame() {
        PrintHello printHello = new PrintHello();
        printHello.printHello();

        Word word = new Word();
        PrintHangman printHangman = new PrintHangman(0, word.getHiddenWord());
        while (isOver(word)) {
            printHangman.print();

        }

    }

    public boolean isOver(Word word) {
        if(word.getListLiterLength() > 5){
            return false;
        }
        else
        {
            return true;
        }
    }
}
