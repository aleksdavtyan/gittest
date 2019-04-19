package toe.tictac;

public class TicTacToe {

    public static void main(String[] args) {
        int size;
        int winSize;
        System.out.println("Welcome to X, O two player Terminal Game.");
        System.out.println("Please enter the square Board size:");
        size = InputReader.readInt();
        System.out.println("Please enter the winning condition size. It must be less than Board size:");
        winSize = InputReader.readInt();
        Board brd = new Board(size);
        System.out.println("This is the initial board.");
        brd.printBoard(brd);
        brd.playerMove(brd, winSize);
    }
}
