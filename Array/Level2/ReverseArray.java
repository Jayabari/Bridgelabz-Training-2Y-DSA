package com.array;

import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp = n;
    int count = 0;

    while (temp != 0) {
        count++;
        temp /= 10;
    }

    int[] digits = new int[count];
    int[] reverse = new int[count];

    for (int i = 0; i < count; i++) {
        digits[i] = n % 10;
        n /= 10;
    }

    for (int i = 0; i < count; i++) {
        reverse[i] = digits[i];
        System.out.print(reverse[i]);
    }
}
}
