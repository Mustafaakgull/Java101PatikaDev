import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math, physics,turkish, chemistry, music;
        System.out.println("Please enter your math grade:");
        math = input.nextDouble();
        System.out.println("Please enter your physics grade:");
        physics = input.nextDouble();
        System.out.println("Please enter your turkish grade:");
        turkish = input.nextDouble();
        System.out.println("Please enter your chemistry grade:");
        chemistry = input.nextDouble();
        System.out.println("Please enter your music grade:");
        music = input.nextDouble();
        if(math < 0 || math > 100) {
            math = 0;
        }
        if(physics < 0 || physics > 100) {
            physics = 0;
        }
        if(turkish < 0 || turkish > 100) {
            turkish = 0;
        }
        if(chemistry < 0 || chemistry > 100) {
            chemistry = 0;
        }
        if(music < 0 || music > 100) {
            music = 0;
        }

        double average = (math + physics + turkish + chemistry + music) / 5;
        System.out.println("Your average is: " + average);
        if(average < 55) {
            System.out.println("You failed!");
        } else {
            System.out.println("You passed!");
        }
    }
}