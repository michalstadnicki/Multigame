import java.util.Scanner;

public class Menu {

    public void menu() throws InterruptedException {

        System.out.println("***************************************");
        System.out.println("*\t\t Game list:");
        System.out.println("***************************************");
        System.out.println("*\r [1] 4 numbers game");
        System.out.println("*\r [2] Paper, rock, scissors game");
        System.out.println("*\r [3] Dice game");
        System.out.println("*\r [4] Tic Tac Toe game");
        System.out.println("*\r [5] Black Jack game ");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("ENTER CHOICE other number to exit:  ");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {

            byte operationNumber = scanner.nextByte();
            switch (operationNumber) {
                case 1:
                    Load load1 = new Load();
                    load1.loading();
                    System.out.println("game 1");
                    break;

                case 2:
                    Load load2 = new Load();
                    load2.loading();
                    System.out.println("game 2");
                    break;

                case 3:
                    Load load3 = new Load();
                    load3.loading();
                    System.out.println("game 3");
                    break;

                case 4:
                    Load load4 = new Load();
                    load4.loading();
                    System.out.println("game 4");
                    break;

                case 5:
                    Load load5 = new Load();
                    load5.loading();
                    System.out.println("game 5");
                    break;

                default:
                    System.out.println("Thanks for playing");
                    exit = true;
            }
        }
        while (!exit);

    }

}