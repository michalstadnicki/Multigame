import java.util.Scanner;

public class Menu {

    public void menu() throws InterruptedException {

        System.out.println("***************************************");
        System.out.println("**\t\t\t MULTIGAME PROJECT \t\t **");
        System.out.println("***************************************");
        System.out.println("**\t\t\t GAME LIST \t\t\t\t **");
        System.out.println("***************************************");
        System.out.println("**\t [1] 4 numbers game \t\t\t **");
        System.out.println("**\t [2] Paper, rock, scissors game  **");
        System.out.println("**\t [3] Dice game  \t\t\t\t **");
        System.out.println("**\t [4] Tic Tac Toe game   \t\t **");
        System.out.println("**\t [5] Black Jack game    \t\t **");
        System.out.println("***************************************");
        System.out.format("%-5s%-4s%-28s%-1s","**",  "[6]", "EXIT", "**");
//        System.out.println("**\t [6] EXIT   \t\t\t\t\t **");
        System.out.println();
        System.out.println("***************************************");
        System.out.print("ENTER CHOICE: ");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {

            byte operationNumber = scanner.nextByte();
            switch (operationNumber) {
                case 1:
//                    4 numbers
                    Load load1 = new Load();
                    load1.loading();
                    FourNumbers numbers = new FourNumbers();
                    numbers.numbers();
//                    System.out.println("game 1");
                    break;

                case 2:
//                    Paper, rock, scissors
                    Load load2 = new Load();
                    load2.loading();
                    PaperRockScissors paper = new PaperRockScissors();
                    paper.paper();
//                    System.out.println("game 2");
                    break;

                case 3:
//                    Dice
                    Load load3 = new Load();
                    load3.loading();
                    System.out.println("game 3");
                    break;

                case 4:
                    Load load4 = new Load();
//                    Tic Tac Toe
                    load4.loading();
                    System.out.println("game 4");
                    break;

                case 5:
//                    Black Jack
                    Load load5 = new Load();
                    load5.loading();
                    System.out.println("game 5");
                    break;

                case 6:
                    System.out.println("Thanks for playing");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid number. You must enter between 1-6 only");
//                    return menu();
                    Menu menu = new Menu();
                    menu.menu();
            }
        }
        while (!exit);

    }

}