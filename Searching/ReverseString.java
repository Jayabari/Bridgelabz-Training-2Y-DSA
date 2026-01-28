package com.searching;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();

        System.out.println(sb.toString());
    }
}

