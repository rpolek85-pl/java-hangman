package pl.edu.agh.hangman;

public class PlayHangmanGame {
    public void playHangmanGame() {
        PrintHello printHello = new PrintHello();
        printHello.printHello();

        GameWord gameWord = new GameWord();
        PrintHangman printHangman = new PrintHangman(gameWord.getHiddenWord());
        UserGet userGet = new UserGet();

        while (!isOver(gameWord) && !gameWord.checkWin()) {
            printHangman.setStep(gameWord.worngLetterNumber());
            printHangman.setHiddenWord(gameWord.getHiddenWord());
            printHangman.print();
            System.out.println(gameWord.getWord());
            String letter = userGet.getLetter();
            gameWord.addLetter(letter);
        }

        System.out.println("Szukane słowo: " + gameWord.getWord());
        if(gameWord.checkWin()){
            System.out.println("YOU WIN!");
        }else  {
            System.out.println("GAME OVER!");
        }

    }


    public boolean isOver(GameWord gameWord) {
        return gameWord.worngLetterNumber() > 6;
    }


}
