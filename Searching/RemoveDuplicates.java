package com.searching;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }

        System.out.println(sb.toString());
    }
}

