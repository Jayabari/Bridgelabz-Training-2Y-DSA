package com.string;

import java.util.Scanner;

public class ShortestLongestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String shortest = words[0], longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length())
                shortest = words[i];
            if (words[i].length() > longest.length())
                longest = words[i];
        }

        System.out.println("Shortest word: " + shortest + " (" + shortest.length() + ")");
        System.out.println("Longest word: " + longest + " (" + longest.length() + ")");
    }
}

