package com.string;

import java.util.Scanner;

public class NumberFormatDemo {

    static String text;

    static void generateException() {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    static void handleException() {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        text = sc.nextLine();

        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Exception generated");
        }

        handleException();
    }
}

