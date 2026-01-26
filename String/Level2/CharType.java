package com.string;

import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Character\tType");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char lower = ch;
            if (ch >= 'A' && ch <= 'Z') {
                lower = (char) (ch + 32); 
            }
            String type;
            if (lower >= 'a' && lower <= 'z') {
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    type = "Vowel";
                } else {
                    type = "Consonant";
                }
            } else {
                type = "Not a Letter";
            }
            System.out.println(ch + "\t\t" + type);
        }
    }
}

