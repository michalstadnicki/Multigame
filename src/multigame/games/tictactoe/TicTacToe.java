package multigame.games.tictactoe;

import multigame.*;
import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> userPosition = new ArrayList<Integer>();
    static ArrayList<Integer> computerPosition = new ArrayList<Integer>();

//    public static void main(String[] args) {

    public void tic() throws InterruptedException {

        System.out.println("***************************************");
        System.out.println("**\t\t\t TIC TAC TOE GAME \t\t **");
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

        char[][] gameBoard = {  {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '},
        };

        printGameBoard(gameBoard);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Your position (1-9):  ");
            int userPos = scanner.nextInt();
            while (userPosition.contains(userPos) || computerPosition.contains(userPos)) {
                System.out.println("Position taken, enter correct position");
                userPos = scanner.nextInt();
            }

            placePiece(gameBoard, userPos, "user");

            String result = chceckWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int computerPosistion = random.nextInt(9) + 1;

            while (userPosition.contains(computerPosistion) || computerPosition.contains(computerPosistion)) {
                computerPosistion = random.nextInt(9) + 1;

            }

            placePiece(gameBoard, computerPosistion, "computer");

            printGameBoard(gameBoard);

            result = chceckWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }

    }

    public static void printGameBoard(char[][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int position, String user) {

        char symbol = ' ';

        if (user.equals("user")) {
            symbol = 'X';
            userPosition.add(position);
        } else if (user.equals("computer")) {
            symbol = 'O';
            computerPosition.add(position);
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }

    }

    public static String chceckWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftCollumn = Arrays.asList(1, 4, 7);
        List middleCollumn = Arrays.asList(2, 5, 8);
        List rightCollumn = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(bottomRow);
        winning.add(leftCollumn);
        winning.add(middleCollumn);
        winning.add(rightCollumn);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (userPosition.containsAll(l)) {
                return "YOU WIN";
            } else if (computerPosition.contains(l)) {
                return "You LOSE";
            } else if (userPosition.size() + computerPosition.size() == 9) {

                return "It's a DRAW";
            }
        }
        return "";
    }
}