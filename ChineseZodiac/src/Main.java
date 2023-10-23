import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] zodiacs= {"Monkey", "Cockerel", "Dog", "Pig", "mouse", "ox",
                "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int year = scanner.nextInt();
        int index = year  % 12;
        System.out.println("Your zodiac is: " + zodiacs[index]);
        System.out.println("Hello world!");
    }
}