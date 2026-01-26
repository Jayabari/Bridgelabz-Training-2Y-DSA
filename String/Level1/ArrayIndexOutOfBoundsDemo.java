package com.string;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    static String[] names;

    static void generateException() {
        System.out.println(names[names.length]);
    }

    static void handleException() {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        handleException();
    }
}

