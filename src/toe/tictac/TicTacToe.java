package toe.tictac;

import java.util.Scanner;


public class TicTacToe {

    public static void main(String[] args) {
        int size;
        System.out.println("Welcome to X, O two player Terminal Game.");
        System.out.println("Please enter the square Board size:");
        size = InputReader.readInt();
        Board brd = new Board(size);
        brd.printBoard(brd);
        brd.playerMove(brd);
    }
}
