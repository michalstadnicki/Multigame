package multigame;

public class Load {

    public void loading() throws InterruptedException {

        for (int i = 0; i <= 50; i++) {
            System.out.print("\t  [");
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            for (int j = 50; j > i; j--) {
                System.out.print("-");
            }
            System.out.print("] " + (i + i) + "% ");
            Thread.sleep(50);
            System.out.print("\r");
        }


        Thread.sleep(1000);
    }


}