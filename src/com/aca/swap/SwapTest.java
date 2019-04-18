package com.aca.swap;

import java.util.Scanner;

public class SwapTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        IntegerWrapper number1 = new IntegerWrapper(5);
        IntegerWrapper number2 = new IntegerWrapper(100);
        number1.setNumber(scanner.nextInt());
        System.out.println("Please input the second number: ");
        number2.setNumber(scanner.nextInt());
        IntegerWrapper.swap(number1, number2);
        System.out.println("a1 = " + number1.getNumber());
        System.out.println("a2 = " + number2.getNumber());
    }
}
