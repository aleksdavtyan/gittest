package com.aca.swap;

public class IntegerWrapper {

    private int number;

    public IntegerWrapper(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }
    void setNumber(int number) {
        this.number = number;
    }

    public static void swap(IntegerWrapper a1, IntegerWrapper a2) {
        int a = a1.number;
        a1.number = a2.number;
        a2.number = a;
    }
}
