package com.string;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = new int[n];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < n; i++) {
            boolean canVote = ages[i] >= 18;
            System.out.println(ages[i] + "\t" + canVote);
        }
    }
}

