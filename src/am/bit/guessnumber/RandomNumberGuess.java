package am.bit.guessnumber;
import java.util.Scanner;

import static am.bit.guessnumber.Comparison.EQUAL;
import static am.bit.guessnumber.Comparison.GREATER;
import static am.bit.guessnumber.Comparison.LESS;


public class RandomNumberGuess {
    Scanner scanner = new Scanner(System.in);

    public static Comparison compareNumbers(int number, NumberGenrator generatedNum) {

        if (number > generatedNum.getNumber()) {
            return Comparison.GREATER;
        } else if (number < generatedNum.getNumber()) {
            return Comparison.LESS;
        }
        return Comparison.EQUAL;
    }

    public static void main(String[] args) {
        NumberGenrator generatedNum = new NumberGenrator();
        int number;
        int numberOfGuesses = 0;
        boolean userCorrrect = false;
        System.out.println("The Generated number = " + generatedNum.getNumber());
        System.out.print("Please input the number until 100: ");

        while (!userCorrrect) {
            numberOfGuesses++;
            number = inputNumber();
            Comparison operator = compareNumbers(number, generatedNum);
            switch (operator) {
                case LESS:
                    System.out.println(LESS + " TRY AGAIN: ");
                    break;
                case GREATER:
                    System.out.println(GREATER + " TRY AGAIN: ");
                    break;
                case EQUAL:
                    System.out.println(EQUAL + "! You Guess the Number from " + numberOfGuesses + " experiments. Congrats!!!");
                    userCorrrect = true;
                    break;
            }
        }
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
