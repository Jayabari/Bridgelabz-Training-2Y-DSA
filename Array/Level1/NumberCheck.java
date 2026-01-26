package com.array;

import java.util.Iterator;
import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				if (arr[i]%2==0) {
					System.out.println("Even");
				}
				else {
					System.out.println("Odd");
				}
			}
			else if(arr[i]==0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("Negative Number");
			}
		}
		if(arr[0]==arr[4]) {
			System.out.println("Equal");
		}
		else if(arr[0]>arr[4]) {
			System.out.println("Greater");
		}
		else
			System.out.println("Smaller");
	}
}
