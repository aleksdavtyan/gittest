package com.aca.swap;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        IntegerWrapper a1 = new IntegerWrapper(5);
        IntegerWrapper a2 = new IntegerWrapper(100);
        a1.setNumber(scanner.nextInt());
        System.out.println("Please input the second number: ");
        a2.setNumber(scanner.nextInt());
        IntegerWrapper.swap(a1, a2);
        System.out.println("a1 = " + a1.getNumber());
        System.out.println("a2 = " + a2.getNumber());
    }
}
