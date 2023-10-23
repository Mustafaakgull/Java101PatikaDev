import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pear, apple, banana, tomato, eggplant;
        double total;
        System.out.println("Enter the mass of the pear (kg): ");
        pear = scanner.nextDouble();
        System.out.println("Enter the mass of the apple (kg): ");
        apple = scanner.nextDouble();
        System.out.println("Enter the mass of the banana (kg): ");
        banana = scanner.nextDouble();
        System.out.println("Enter the mass of the tomato (kg): ");
        tomato = scanner.nextDouble();
        System.out.println("Enter the mass of the eggplant (kg): ");
        eggplant = scanner.nextDouble();
        total = pear * 2.14 + apple * 3.67 + banana * 0.95 + tomato * 1.11 + eggplant * 5;
        System.out.println("Total: " + total);
    }
}