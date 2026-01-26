package com.string;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] choices = {"rock","paper","scissors"};
        int userWins=0, compWins=0;

        for(int i=1;i<=n;i++){
            System.out.print("Your choice: ");
            String user = sc.nextLine().toLowerCase();
            String comp = choices[(int)(Math.random()*3)];

            String winner = "";
            if(user.equals(comp)) winner = "Draw";
            else if((user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("paper") && comp.equals("rock")) ||
                    (user.equals("scissors") && comp.equals("paper"))){
                winner="User"; userWins++;
            } else { winner="Computer"; compWins++; }

            System.out.println("Game"+i+": You-"+user+", Comp-"+comp+", Winner-"+winner);
        }

        System.out.println("User wins: "+userWins+", Computer wins: "+compWins);
        System.out.printf("User%%: %.2f, Comp%%: %.2f\n", userWins*100.0/n, compWins*100.0/n);
    }
}

