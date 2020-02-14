import java.util.Scanner;

public class Menu {

    public void menu() {

        System.out.println("Game list:");
        System.out.println("1 - game 1");
        System.out.println("2 - game 2");
        System.out.println("3 - game 3");
        System.out.println("4 - game 4");
        System.out.println("5 - game 5");
        System.out.println("Other number to exit");

        System.out.println();

        System.out.print("Enter: ");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {

            byte operationNumber = scanner.nextByte();
            switch (operationNumber) {
                case 1:
                    System.out.println("game 1");
                    break;
                case 2:
                    System.out.println("game 2");
                    break;
                case 3:
                    System.out.println("game 3");
                    break;
                case 4:
                    System.out.println("game 4");
                    break;
                case 5:
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
