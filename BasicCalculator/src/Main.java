import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double a = sc.nextInt();
        System.out.println("enter second number");
        double b = sc.nextInt();
        System.out.println("1) sum\n2) sub\n3) mul\n4) div");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("sum = " + (a + b));
                break;
            case 2:
                System.out.println("sub = " + (a - b));
                break;
            case 3:
                System.out.println("mul = " + (a * b));
                break;
            case 4:
                if(b == 0) {
                    System.out.println("you cant divide a number to 0!!!!");
                    break;
                }
                System.out.println("div = " +(double)(a / b));
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}