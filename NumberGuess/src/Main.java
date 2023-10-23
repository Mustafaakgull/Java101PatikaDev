import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (counter < 5) {
            System.out.print("enter a number:");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100.");
                if (isWrong) {
                    counter++;
                    System.out.println("your rights: " + (5 - counter));
                } else {
                    isWrong = true;
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congrulations, true !!!" + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong Guess !");
                if (selected > number) {
                    System.out.println(selected + " is too high.");
                } else {
                    System.out.println(selected + " is too low.");
                }

                wrong[counter++] = selected;
                System.out.println("you can guess: " + (5 - counter)+ " more times.");
            }
        }

        if (!isWin) {
            System.out.println("you lost. ! ");
            if (!isWrong) {
                System.out.println("your guesses" + Arrays.toString(wrong));
            }
        }

    }
}
