package com.string;

class Anagram {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int[] freq = new int[256];

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }
        boolean anagram = true;
        for (int i = 0; i < 256; i++)
            if (freq[i] != 0)
                anagram = false;
        System.out.println(anagram);
    }
}

