package com.string;

import java.util.Scanner;

public class WordLength2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int words = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] wordArr = new String[words];
        int k = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                wordArr[k++] = temp;
                temp = "";
            }
        }
        wordArr[k] = temp;
        String[][] result = new String[wordArr.length][2];
        for (int i = 0; i < wordArr.length; i++) {

            int len = 0;
            try {
                while (true) {
                    wordArr[i].charAt(len);
                    len++;
                }
            } catch (Exception e) {
            }
            result[i][0] = wordArr[i];
            result[i][1] = String.valueOf(len);
        }
        for (int i = 0; i < result.length; i++) {
            int l = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + l);
        }
    }
}

