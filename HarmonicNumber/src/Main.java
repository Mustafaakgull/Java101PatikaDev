import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = scan.nextInt();
        double result = 0.00;
        for (double i = 1; i <= n; i++) {
            result = result + (1 / i);
        }
        System.out.println("Result: " + result);
    }
}