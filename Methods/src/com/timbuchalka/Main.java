package com.timbuchalka;

// a method return void is also called 'procedure', return something called 'function';
public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, score, levelCompleted, bonus); // call the method
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int position1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Tom", position1);

        int position2 = calculateHighScorePosition(900);
        displayHighScorePosition("Peter", position2);

        int position3 = calculateHighScorePosition(400);
        displayHighScorePosition("Lucy", position3);

        int position4 = calculateHighScorePosition(50);
        displayHighScorePosition("Lily", position4);
    }

    //public: a public method; static: method in a class without instances; int: return sth/ void: return nothing
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //create a method

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return  finalScore;
        } else {
            return -1;
        }
    }

    //----------challenge-------------
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000){
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if(score >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4;
        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }

        return position;

        }
    }
