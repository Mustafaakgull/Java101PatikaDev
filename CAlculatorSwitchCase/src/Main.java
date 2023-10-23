import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double nb1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double nb2 = input.nextDouble();

        System.out.println("1-Summation\n2-Subtraction\n3-Division\n4-Multiplication");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(nb1 + nb2);
                break;
            case 2:
                System.out.println(nb1 - nb2);
                break;
            case 3:
                System.out.println(nb1 / nb2);
                break;
            case 4:
                System.out.println(nb1 * nb2);
                break;
            default:
                System.out.println("Wrong Entry!!!");
                break;
        }
    }
}