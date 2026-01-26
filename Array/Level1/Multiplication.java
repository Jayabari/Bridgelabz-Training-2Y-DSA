package com.array;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] res = new int[4];
	for(int i=6;i<=9;i++) {
		res[i-6] = n*i;
	}for(int i=6;i<=9;i++) {
		System.out.println(n+" * "+i+" = "+res[i-6]);
		}
}
}
