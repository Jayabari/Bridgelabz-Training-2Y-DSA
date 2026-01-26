package com.array;

import java.util.Scanner;

public class MeanHeight {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[] arr = new double[11];
	double mean =0.0;
	double sum =0.0;
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextDouble();
	}
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	mean = sum/11;
	System.out.println(mean);
}
}
