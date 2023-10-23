import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        if((a>b) && (a>c))
            System.out.println("Max is a: " + a);
        else if((b>a) && (b>c))
            System.out.println("Max is b: " + b);
        else
            System.out.println("Max is c: " + c);
    }
}