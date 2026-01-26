package com.array;

import java.util.Scanner;

public class LargestDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int maxDigit = 10;
	int[] arr = new int[maxDigit];
	int index =0;
	while(n!=0 && index<maxDigit) {
		arr[index++]= n%10;
		n/=10;
	}
	int largest = 0;
	int secondlargest = -1;
	for(int i=0;i<index;i++) {
		if(arr[i]>largest) {
			secondlargest = largest;
			largest = arr[i];
		}
		else if(arr[i]!= largest && arr[i]>secondlargest) {
			secondlargest = arr[i];
		}
	}
	System.out.println(largest);
	System.out.println(secondlargest);
}
}
