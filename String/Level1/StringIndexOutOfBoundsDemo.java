package com.string;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static String text;

    static void generateException() {
        System.out.println(text.charAt(text.length())); 
    }

    static void handleException() {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        text = sc.nextLine();

        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        handleException();
    }
}

