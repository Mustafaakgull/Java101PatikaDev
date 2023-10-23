import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter exponential number: ");
        int exp = sc.nextInt();
        //System.out.println("The result is: " + Math.pow(base, exp));
        int result=1;
        for(int i=1;i<=exp;i++){
            result=result*base;
        }
        System.out.println("The result is: " + result);
    }
}