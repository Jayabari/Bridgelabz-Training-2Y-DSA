package com.searching;

public class PeakElement {
    public static void main(String[] args) {

        int[] a = {1, 3, 20, 4, 1};
        int left = 0, right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid > 0 && mid < a.length - 1 &&
                a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                System.out.println("Peak = " + a[mid]);
                break;
            } else if (mid > 0 && a[mid] < a[mid - 1])
                right = mid - 1;
            else
                left = mid + 1;
        }
    }
}

