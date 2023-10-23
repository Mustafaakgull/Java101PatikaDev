import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scan.nextInt();

        int total = 0;

        while (number > 0) {
            int digit = number % 10;
            total = total+digit;
            number = number / 10;
        }

        System.out.println("Basamakların toplamı: " + total);
    }
}
