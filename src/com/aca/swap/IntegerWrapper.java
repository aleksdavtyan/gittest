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

    public static void swap(IntegerWrapper number1, IntegerWrapper number2) {
        int a = number1.number;
        number1.number = number2.number;
        number2.number = a;
    }
}
