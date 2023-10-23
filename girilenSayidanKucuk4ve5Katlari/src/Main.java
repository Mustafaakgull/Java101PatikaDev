import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();
        if (num < 0)
            System.out.println("invalid input");
        else {
            for (int i = 0; i < num; i++) {
                if (Math.pow(i, 2) < num)
                    System.out.println((int) Math.pow(i, 2));
            }
        }

    }
}