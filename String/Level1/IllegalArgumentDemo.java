package com.string;


import java.util.Scanner;

public class IllegalArgumentDemo {

    static String text;

    static void generateException() {
        System.out.println(text.substring(5, 2));
    }

    static void handleException() {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        text = sc.nextLine();

        try {
            generateException();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated");
        }

        handleException();
    }
}

