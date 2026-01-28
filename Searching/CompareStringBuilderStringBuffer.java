package com.searching;

public class CompareStringBuilderStringBuffer {
    public static void main(String[] args) {

        long start, end;

        StringBuilder sb1 = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
            sb1.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));

        StringBuffer sb2 = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
            sb2.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start));
    }
}

