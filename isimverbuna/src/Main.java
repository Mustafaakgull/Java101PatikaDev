import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n=0,total=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("enter a number: ");
            n = scan.nextInt();
            if (n % 2 == 0 || n % 4 == 0) {
                total += n;
                System.out.println("total is: " + total);
            } else {
                System.out.println("odd number is entered.  Exit...");
                break;
            }
        }
        while(n>0);
        System.out.println("total is: " + total + "\n");

    }}