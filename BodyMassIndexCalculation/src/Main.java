import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mass (kg): ");
        double mass = sc.nextDouble();
        System.out.println("Please enter your height (m): ");
        double height = sc.nextDouble();
        double bmi = mass / Math.pow(height, 2);
        System.out.printf("your bmi is: %.2f", bmi);

    }
}