package com.sorting;

import java.util.Scanner;

public class HeapSortSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = n / 2 - 1; i >= 0; i--) {
            int parent = i;
            while (parent * 2 + 1 < n) {
                int child = parent * 2 + 1;
                if (child + 1 < n && a[child] < a[child + 1])
                    child++;
                if (a[parent] < a[child]) {
                    int temp = a[parent];
                    a[parent] = a[child];
                    a[child] = temp;
                    parent = child;
                } else break;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            int parent = 0;
            while (parent * 2 + 1 < i) {
                int child = parent * 2 + 1;
                if (child + 1 < i && a[child] < a[child + 1])
                    child++;
                if (a[parent] < a[child]) {
                    temp = a[parent];
                    a[parent] = a[child];
                    a[child] = temp;
                    parent = child;
                } else break;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
