package com.string;

import java.util.Scanner;

public class ConvertUppercase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String text = sc.next();
	String result = "";
	for(int i=0;i<text.length();i++) {
		char ch = text.charAt(i);
	if(ch>='a'&& ch<='z') {
		ch = (char)(ch-32);
	}
	result+=ch;
	}
	String upper = text.toUpperCase();
	boolean flag = true;
	for(int i=0;i<result.length();i++) {
		if(result.charAt(i)!=upper.charAt(i)) {
			flag = false;
			break;
		}
	}
	System.out.println(result);
}
}
