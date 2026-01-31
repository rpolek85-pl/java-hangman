package pl.edu.agh.hangman;

public class PlayHangmanGame {
    public void playHangmanGame() {
        PrintHello printHello = new PrintHello();
        printHello.printHello();

        Word word = new Word();
        PrintHangman printHangman = new PrintHangman(word.getHiddenWord());
        UserGet userGet = new UserGet();

        while (isOver(word)) {
            printHangman.setStep(word.getListLiterLength());
            printHangman.print();
            System.out.println(word.getHiddenWord());
            System.out.println(word.getWord());
            String letter = userGet.getLetter();
            word.addLetter(letter);

        }



    }

    public boolean isOver(Word word) {
        if(word.getListLiterLength() > 6){
            return false;
        }
        else
        {
            return true;
        }
    }


}
