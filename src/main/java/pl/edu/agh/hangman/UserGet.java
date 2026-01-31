package pl.edu.agh.hangman;

import java.util.Scanner;

public class UserGet {

    public String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter letter:");
            String letter = scanner.next();
            if (letter.length() != 1) {
                System.out.println("Wrong letter");
                continue;
            }
            char ch = letter.charAt(0);
            if(!Character.isLetter(ch)) {
                System.out.println("Wrong letter");
                continue;
            }
            return letter.toUpperCase();
        }
    }
}

