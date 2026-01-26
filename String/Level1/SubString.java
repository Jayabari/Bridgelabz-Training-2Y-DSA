package com.string;

import java.util.Scanner;

public class SubString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String text = sc.next();
	int start = sc.nextInt();
	int end = sc.nextInt();
	String s1 ="";
	for(int i=start;i<end;i++) {
		s1 = s1+text.charAt(i);
	}
	String s2 = text.substring(start, end);
	 boolean result = true;

     if (s1.length() != s2.length()) {
         result = false;
     } else {
         for (int i = 0; i < s1.length(); i++) {
             if (s1.charAt(i) != s2.charAt(i)) {
                 result = false;
                 break;
             }
         }
     }
     if (result)
         System.out.println("Both substrings are equal");
     else
         System.out.println("Both substrings are not equal");
}
}
