package toe.tictac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    static String inputStr;
    static int inputInt;


    public static String readStr() {
        Scanner strScanner = new Scanner(System.in);
        inputStr = strScanner.nextLine();
        return inputStr;
    }

    public static int readInt() {
        Scanner intScanner = new Scanner(System.in);
        try {
            inputInt = intScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input number. Please re-enter a number.");
        }
        return inputInt;
    }
}
