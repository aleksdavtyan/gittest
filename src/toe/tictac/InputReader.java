package toe.tictac;

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
        inputInt = scanner.nextInt();
        return inputInt;
    }
}
