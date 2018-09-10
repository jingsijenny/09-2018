import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Random abc = new Random();
        int randomNumber = abc.nextInt(100);
        System.out.println("Please select a random number between 0 to 100");
        Scanner sc = new Scanner(System.in);


/*        for(int i = -1; i != randomNumber;){
            i = sc.nextInt();
            if (i > randomNumber){
                System.out.println("The number you select is too big");
            }else if(i < randomNumber){
                System.out.println("The number you select is too small");
            }else {
                System.out.println(" Win!");
            }
        }*/

        while (true) {
            int i = sc.nextInt();
            if (i == randomNumber) {
                System.out.println(" Win!");
                break;
            } else if (i > randomNumber) {
                System.out.println("The number you select is too big");
            } else {
                System.out.println("The number you select is too small");
            }
        }
    }
}
