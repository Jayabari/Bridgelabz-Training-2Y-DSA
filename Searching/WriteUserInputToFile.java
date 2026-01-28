package com.searching;

import java.io.*;

public class WriteUserInputToFile {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");

        String line;
        while (true) {
            line = br.readLine();
            if (line.equals("exit"))
                break;
            fw.write(line + "\n");
        }

        fw.close();
    }
}

