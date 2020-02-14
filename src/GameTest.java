import java.util.Random;
import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {

//        public void gameTest() {

//        GameTest test = new GameTest();
//     test.gameTest();

//        System.out.println("GAME TEST");

        System.out.println("How many attempts do you want to guess the 4-digit number?");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your attemps: ");
        int attemps = scanner.nextInt();

        if (attemps < 1) {
            System.out.println("Wrong number attemps must be 2222");
        } else {

            System.out.println("Attemps OK");

        }

    }

}