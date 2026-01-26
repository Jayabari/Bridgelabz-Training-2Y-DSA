package com.string;

import java.util.Scanner;

public class SplitCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int words = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] a = new String[words];
        int k = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                a[k++] = temp;
                temp = "";
            }
        }
        a[k] = temp;

        String[] b = text.split(" ");

        boolean same = true;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                same = false;
                break;
            }
        }

        System.out.println(same);
    }
}

