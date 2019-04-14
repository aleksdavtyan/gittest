package am.bit.guessnumber;

import java.util.Random;

public class NumberGenrator {

    private int number;

    int getNumber() {
        return number;
    }
    void setNumber(int number) {
        this.number = number;
    }

    NumberGenrator() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }
}
