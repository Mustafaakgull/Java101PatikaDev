import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first line of triangle: !");
        int a=scan.nextInt();
        System.out.println("Enter the second line of triangle: !");
        int b=scan.nextInt();
        System.out.println("Here is the hipotenus: "+Math.sqrt(a*a+b*b));
    }
}