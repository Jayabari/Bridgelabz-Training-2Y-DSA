package com.sorting;

import java.util.Scanner;

public class QuickSortProducts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int top = -1;
        int[] stack = new int[n];
        stack[++top] = 0;
        stack[++top] = n - 1;

        while (top >= 0) {
            int high = stack[top--];
            int low = stack[top--];

            int pivot = a[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (a[j] < pivot) {
                    i++;
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }

            int t = a[i + 1];
            a[i + 1] = a[high];
            a[high] = t;

            int p = i + 1;

            if (p - 1 > low) {
                stack[++top] = low;
                stack[++top] = p - 1;
            }
            if (p + 1 < high) {
                stack[++top] = p + 1;
                stack[++top] = high;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

