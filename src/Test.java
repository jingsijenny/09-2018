import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(50) + 1;
        System.out.println(n);
    }
}
