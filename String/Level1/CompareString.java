package com.string;

import java.util.Scanner;

public class CompareString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1 = sc.next();
	String str2 = sc.next();
	boolean flag = true;
	if(str1.length()!=str2.length()) {
		flag = false;
	}else {
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				flag = false;
				break;
			}
		}
	}
	
	if(flag) {
		System.out.println("Equal");
	}
	else
		System.out.println("Not equal");
}
}
