import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {

//    public static void main(String[] args) {

    public void black() throws InterruptedException {

        System.out.println("***************************************");
        System.out.println("**\t\t\t BLACK JACK GAME \t\t **");
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
        ArrayList<Integer> cards = new ArrayList<>();
        ArrayList<Integer> user = new ArrayList<>();
        ArrayList<Integer> computer = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 12; j++) {
                cards.add(j);
            }
        }
        Collections.shuffle(cards, new Random());

        user.add(cards.get(cards.size() - 1));
        cards.remove(cards.size() - 1);
        computer.add(cards.get(cards.size() - 1));
        cards.remove(cards.size() - 1);
        user.add(cards.get(cards.size() - 1));
        cards.remove(cards.size() - 1);
        computer.add(cards.get(cards.size() - 1));
        cards.remove(cards.size() - 1);

        boolean didUserTake = true;
        boolean didComputerTake = true;
        while (true) {
            if (didUserTake) {
                didUserTake = getUserInput(user);
            }
            if (didComputerTake) {
                didComputerTake = getComputerInput(computer);
            }
            if (didUserTake) {
                user.add(cards.get(cards.size() - 1));
                cards.remove(cards.size() - 1);
            }
            if (didComputerTake) {
                computer.add(cards.get(cards.size() - 1));
                cards.remove(cards.size() - 1);
            }
            if (!didUserTake && !didComputerTake) {
                compareCards(user, computer);
                break;
            }
        }
    }

    private static boolean getUserInput(ArrayList<Integer> user) {
        int sum = user.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Your cards: " + user + ". Sum = " + sum);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to take a card? (Y/N):  ");
        while (true) {
            String decision = scanner.nextLine().toUpperCase();
            if (decision.equals("Y")) {
                return true;
            } else if (decision.equals("N")) {
                return false;
            } else {
                System.out.print("Wrong input! Do you want to take a card? (Y/N):  ");
            }
        }
    }

    private static boolean getComputerInput(ArrayList<Integer> computer) {
        int sum = computer.stream().mapToInt(Integer::intValue).sum();
        if ((21 - sum) > 4) {
            return true;
        } else {
            return false;
        }
    }

    private static void compareCards(ArrayList<Integer> user, ArrayList<Integer> computer) {

        int userSum = user.stream().mapToInt(Integer::intValue).sum();
        int computerSum = computer.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Your cards: " + user + ". Sum = " + userSum);
        System.out.println("Computer cards: " + computer + ". Sum = " + computerSum);
        if (userSum == 22 && user.size() == 2) {
            userSum--;
        }
        if (computerSum == 22 && computer.size() == 2) {
            computerSum--;
        }
        if (userSum == computerSum || (userSum > 21 && computerSum > 21)) {
            System.out.println("It's a DRAW");

        } else if ((userSum > computerSum && (userSum <= 21 && computerSum <= 21)) || (userSum <= 21 && computerSum > 21)) {
            System.out.println("You WIN");

        } else {
            System.out.println("You LOSE");
        }
    }
}