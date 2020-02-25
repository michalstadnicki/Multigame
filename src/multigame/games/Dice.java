package multigame.games;

import multigame.*;
import java.util.Random;
import java.util.Scanner;

public class Dice {

//    public static void main(String[] args) throws InterruptedException {

    public void dice() throws InterruptedException {

        System.out.println("***************************************");
        System.out.println("**\t\t\t DICE GAME \t\t\t\t **");
        System.out.println("***************************************");

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

        int user = random();
        int computer = random();

        System.out.println("user");
        switch (user) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
            case 6:
                six();
                break;
            case 7:
                seven();
                break;
            case 8:
                eight();
                break;
            case 9:
                nine();
                break;
        }
        System.out.println("computer");
        switch (computer) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
            case 6:
                six();
                break;
            case 7:
                seven();
                break;
            case 8:
                eight();
                break;
            case 9:
                nine();
                break;
        }
        if (user > computer) {
            System.out.println("You WIN");
        }
        if (user < computer) {
            System.out.println("You LOSE");
        }
        if (user == computer) {
            System.out.println("It's a DRAW");
        }
    }

    public static void one() {
        System.out.println("---------\n|       |\n|   *   |\n|       |\n---------");
    }

    public static void two() {
        System.out.println("---------\n|     * |\n|       |\n| *     |\n---------");
    }

    public static void three() {
        System.out.println("---------\n|     * |\n|   *   |\n| *     |\n---------");
    }

    public static void four() {
        System.out.println("---------\n| *   * |\n|       |\n| *   * |\n---------");
    }

    public static void five() {
        System.out.println("---------\n| *   * |\n|   *   |\n| *   * |\n---------");
    }

    public static void six() {
        System.out.println("---------\n| *   * |\n| *   * |\n| *   * |\n---------");
    }

    public static void seven() {
        System.out.println("---------\n| *   * |\n| * * * |\n| *   * |\n---------");
    }

    public static void eight() {
        System.out.println("---------\n| * * * |\n| *   * |\n| * * * |\n---------");
    }

    public static void nine() {
        System.out.println("---------\n| * * * |\n| * * * |\n| * * * |\n---------");
    }


    public static int random() {
        Random random = new Random();
        int dice = random.nextInt(9) + 1;
        return dice;
    }
}