package com.c4q.T.Nehisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2017 Kan Cobra karate invitational tournament. The first division that you will be competing in today is kata or forms. Please proceed to the mat to perform your black belt kata.");
        System.out.println("You must complete 4 correct moves in your kata.");
        System.out.println("Please enter a kata move (use any number).");
        Scanner input = new Scanner(System.in);

        Kata newKata = new Kata();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2, randomNum + 3};

        newKata.setLocationsCells(locations);

        boolean isStillRunning = true;

        while (isStillRunning) {
            String guess = input.next();
            String result = newKata.checkMove(guess);

            switch (result) {
                case "Kia":
                    System.out.println("You completed a great form and won FIRST PLACE in KATA!!");
                    break;
                default:
                    continue;
            }

        }
    }
}
