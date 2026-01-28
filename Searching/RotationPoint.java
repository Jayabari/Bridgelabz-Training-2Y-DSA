package com.searching;

public class RotationPoint {
    public static void main(String[] args) {

        int[] a = {4,5,6,7,1,2,3};
        int left = 0, right = a.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] > a[right])
                left = mid + 1;
            else
                right = mid;
        }

        System.out.println("Rotation Index = " + left);
    }
}
