package com.searching;

public class FirstNegativeNumber {
    public static void main(String[] args) {

        int[] a = {5, 8, -3, 4, -1};
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

