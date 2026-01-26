package com.array;

import java.util.Scanner;

public class YoungestFriend {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] age = new int[3];
	int[] height = new int[3];
	for(int i=0;i<3;i++) {
		age[i] = sc.nextInt();
		height[i] = sc.nextInt();
	}
	int minage = age[0];
	int maxheight = height[0];
	for(int i=0;i<3;i++) {
		if(age[i]<minage) {
			minage = age[i];
		}
		if(height[i]>maxheight) {
			maxheight = height[i];
		}
	}
	System.out.println(minage);
	System.out.println(maxheight);
}
}
