package com.searching;

public class SearchWordInSentence {
    public static void main(String[] args) {

        String[] sentences = {
            "Java is easy",
            "I love programming",
            "Hello world"
        };

        String word = "programming";
        String result = "Not Found";

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                result = sentences[i];
                break;
            }
        }

        System.out.println(result);
    }
}

