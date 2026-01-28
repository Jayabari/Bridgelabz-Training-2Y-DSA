package com.sorting;

import java.util.Scanner;

public class CountingSortAges {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++)
            ages[i] = sc.nextInt();

        int[] count = new int[19];

        for (int i = 0; i < n; i++)
            count[ages[i]]++;

        for (int age = 10; age <= 18; age++) {
            while (count[age] > 0) {
                System.out.print(age + " ");
                count[age]--;
            }
        }
    }
}

