package com.searching;

public class BinarySearch2DMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };

        int target = 9;
        int rows = a.length;
        int cols = a[0].length;

        int left = 0, right = rows * cols - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int value = a[mid / cols][mid % cols];

            if (value == target) {
                found = true;
                break;
            } else if (value < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println(found);
    }
}

