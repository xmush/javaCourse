package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int highScorePosition;

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Agus", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Yopi", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ajay", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position " + highScorePosition + " on high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
