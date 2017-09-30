package com.c4q.T.Nehisi;

public class Kata {
    int [] locationsCells;
    int numOfMoves = 0;

    public void setLocationsCells(int[] locs){
        locationsCells = locs;
    }

    public String checkMove(String userGuessMove) {
        int guess = Integer.parseInt(userGuessMove);
        String result = "Wrong move!";
        for (int cell : locationsCells){
            if(guess == cell){
                result = "Right move!";
                numOfMoves++;
                break;
            }
        }
        if(numOfMoves == locationsCells.length){
            result = "Kia";
        }
        System.out.println(result);
        return result;
    }
}
