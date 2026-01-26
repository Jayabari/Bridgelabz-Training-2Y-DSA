package com.string;

import java.util.Scanner;

public class StringLengthDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // exception stops the loop
        }
        System.out.println("Length without length(): " + count);
        System.out.println("Length using length(): " + text.length());
    }
}
