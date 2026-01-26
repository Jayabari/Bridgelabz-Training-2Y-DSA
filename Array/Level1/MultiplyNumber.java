package com.array;

import java.util.Scanner;

public class MultiplyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] res = new int[10];
		for(int i=1;i<=10;i++) {
			res[i-1] = n*i;
		}
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+res[i-1]);
		}
	}
}
