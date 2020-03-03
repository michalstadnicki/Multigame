package multigame.games.paperrockscissors;

import multigame.*;
import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors {

//    public static void main(String[ ] args) {

    public void paper() throws InterruptedException {

        System.out.println("***************************************");
        System.out.println("**\t ROCK PAPER SCISSORS GAME \t\t **");
        System.out.println("***************************************\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            startGame();
            System.out.print("Do you want to play again? (Y/N):  ");
            String decision = scanner.nextLine().toUpperCase();
            if (decision.equals("Y")) {
                continue;
            } else {
                Menu menu = new Menu();
                menu.menu();
            }
        }
    }

    private static void startGame() {

        Scanner scaner = new Scanner(System.in);

        System.out.println("[0] Rock \n" + "[1] Paper \n" + "[2] Scissors ");

        System.out.print("ENTER CHOICE:  ");
        int user = scaner.nextInt();

        Random random = new Random();
        int computer = random.nextInt(2);

        if (user == 0) System.out.println("You have chosen ROCK");
        if (user == 1) System.out.println("You have chosen choosen PAPER");
        if (user == 2) System.out.println("You have chosen choosen SCISSORS");
        if (computer == 0) System.out.println("Computer has choosen ROCK");
        if (computer == 1) System.out.println("Computer has choosen PAPER");
        if (computer == 2) System.out.println("Computer has choosen SCISSORS");


        if (computer == user) {
            System.out.println("It's a DRAW");
            return;
        }

        if (computer == 0) {

            if (user == 1) {
                System.out.println("You WIN");
            } else {
                System.out.println("You LOSE");
            }
            return;

        }
        if (computer == 1) {
            if (user == 0) {
                System.out.println("You LOSE!");
            } else {
                System.out.println("You WIN");
            }
            return;
        }

        if (computer == 2) {
            if (user == 0) {
                System.out.println("You WIN");
            } else {
                System.out.println("You LOSE");
            }
            return;
        }
    }

}