package com.searching;

import java.io.*;

public class CountWordInFile {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        String target = "java";
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for (String w : words) {
                if (w.equals(target))
                    count++;
            }
        }

        System.out.println("Count = " + count);
        br.close();
    }
}

