package com.sorting;

import java.util.Scanner;

public class MergeSortBooks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int size = 1; size < n; size = size * 2) {
            for (int left = 0; left < n; left = left + 2 * size) {

                int mid = left + size;
                int right = left + 2 * size;

                if (mid > n) mid = n;
                if (right > n) right = n;

                int i = left, j = mid, k = left;

                while (i < mid && j < right) {
                    if (a[i] <= a[j])
                        temp[k++] = a[i++];
                    else
                        temp[k++] = a[j++];
                }

                while (i < mid) temp[k++] = a[i++];
                while (j < right) temp[k++] = a[j++];

                for (int x = left; x < right; x++)
                    a[x] = temp[x];
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

