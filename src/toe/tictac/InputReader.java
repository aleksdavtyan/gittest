package toe.tictac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    static String inputStr;
    static int inputInt;
    static Scanner scanner = new Scanner(System.in);


    public static String readStr() {
        inputStr = scanner.nextLine();
        return inputStr;
    }

    public static int readInt() {
        try {
            inputInt = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input number. Please re-enter a number.");
        }
        return inputInt;
    }
}
