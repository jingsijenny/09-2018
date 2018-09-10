import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args){
        System.out.println("please input a number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("the number you input is :" + i);
    }

}
