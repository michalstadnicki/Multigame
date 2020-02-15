import java.util.Random;

public class Dice {

        public static void six(){
            System.out.print("---------\n| *   * |\n| *   * |\n| *   * |\n---------");
        }

        public static void five(){
            System.out.print("---------\n| *   * |\n|   *   |\n| *   * |\n---------");
        }

        public static void four(){
            System.out.print("---------\n| *   * |\n|       |\n| *   * |\n---------");
        }

        public static void three(){
            System.out.print("---------\n|     * |\n|   *   |\n| *     |\n---------");
        }

        public static void two(){
            System.out.print("---------\n|     * |\n|       |\n| *     |\n---------");
        }

        public static void one(){
            System.out.print("---------\n|       |\n|   *   |\n|       |\n---------");
        }


        public static int random(){
            Random random = new Random();
            int a = random.nextInt(6)+1;
            return a;
        }
        public static void main(String[] args) {
            int user = random();
            int computer = random();

            System.out.println("user");
            switch(user){
                case 1: one();   break;
                case 2: two();   break;
                case 3: three(); break;
                case 4: four();  break;
                case 5: five();  break;
                case 6: six();   break;
            }
            System.out.println("\n");
            System.out.println("computer");
            switch(computer){
                case 1: one();   break;
                case 2: two();   break;
                case 3: three(); break;
                case 4: four();  break;
                case 5: five();  break;
                case 6: six();   break;
            }
            if(user>computer){
                System.out.println("You WIN");
            }
            if(user<computer){
                System.out.println("You LOSE");
            }
            if(user==computer){
                System.out.println("It's a DRAW");
            }
        }
    }