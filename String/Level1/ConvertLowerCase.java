package com.string;

import java.util.Scanner;

public class ConvertLowerCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String text = sc.next();
	String result = "";
	for(int i=0;i<text.length();i++) {
		char ch = text.charAt(i);
	if(ch>='A'&& ch<='Z') {
		ch = (char)(ch+32);
	}
	result+=ch;
	}
	String lower = text.toLowerCase();
	boolean flag = true;
	for(int i=0;i<result.length();i++) {
		if(result.charAt(i)!=lower.charAt(i)) {
			flag = false;
			break;
		}
	}
	System.out.println(result);
}
}


