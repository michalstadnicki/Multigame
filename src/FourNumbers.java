import java.util.Random;
import java.util.Scanner;

public class FourNumbers {

//    public static void main(String[] args) {

    public void numbers() throws InterruptedException {

        System.out.println("How many attempts do you want to guess the 4-digit number?");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your attemps (1-20): ");
        int attemps = scanner.nextInt();

        if (attemps < 1) {
            System.out.println("Wrong number attemps must be greater than 0");
            FourNumbers numbers = new FourNumbers();
            numbers.numbers();
        } else if (attemps > 20) {
            System.out.println("Wrong number attemps must be lower than 20");
            FourNumbers numbers = new FourNumbers();
            numbers.numbers();
        } else {
            System.out.println("");
            System.out.println("Computer generated 4 digits number (digits don't repeat).\n"
                    + "You can try to guess the 4 digits number in " + attemps + " attempts.\n");
            System.out.println("***************************************");
            System.out.println("**\t\t\t 4 NUMBERS GAME \t\t **");
            System.out.println("***************************************");

            int[] random = numberGenerator();
//        int attemps = 15;
            int indexMatch = 0;
            int match = 0;
            while (attemps > 0 && indexMatch != 4) {
                int[] guess = getGuess();
                indexMatch = 0;
                match = 0;
                for (int i = 0; i < guess.length; i++) {
                    if (guess[i] == random[i]) {
                        indexMatch++;
                    } else if (guess[i] == random[0] || guess[i] == random[1] || guess[i] == random[2] || guess[i] == random[3]) {
                        match++;
                    }
                }
                if (indexMatch == 4) {
                    System.out.print("Well done! Your number is Correct! The number is: ");
                    for (int i = 0; i < guess.length; i++) {
                        System.out.print(guess[i]);
                    }
                } else {
                    attemps--;
                    if (attemps > 1) {
                        System.out.println("You have guess " + indexMatch + " correct number in correct position," +
                                " and " + match + " correct number in incorrect position. " + attemps + " attempts remaining. ");
                    } else if (attemps == 1) {
                        System.out.println("You have guess " + indexMatch + " correct number in correct position," +
                                " and " + match + " correct number in incorrect position. Last attempt! Good luck! ");
                    } else {
                        System.out.println("Sorry, you failed.");
                        System.out.print("The number is: ");
                        for (int i = 0; i < random.length; i++) {
                            System.out.print(random[i]);
                        }

                    }
                }
            }
        }
    }

    public static int[] getGuess() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your guess: ");
        String input = keyboard.nextLine();

        if (input.length() != 4 || input.replaceAll("\\D", "").length() != 4) {
            System.out.println("Invalid number. You must enter 4 digits between 0-9 only.");
            return getGuess();
        }
        int[] guess = new int[4];
        for (int i = 0; i < 4; i++) {
            guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        return guess;
    }

    public static int[] numberGenerator() {
        Random random = new Random();
        int[] randomArray = {10, 10, 10, 10};

        for (int i = 0; i < randomArray.length; i++) {
            int temp = random.nextInt(9);
            while (temp == randomArray[0] || temp == randomArray[1] || temp == randomArray[2] || temp == randomArray[3]) {
                temp = random.nextInt(9);
            }
            randomArray[i] = temp;
        }
        return randomArray;
    }

}