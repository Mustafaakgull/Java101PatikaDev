import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int gcd=0;
        if(a<=0 || b<=0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int max=Math.max(a,b);
        for(int i=1;i<=max;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("Greatest Common Divisor (GCD) is: "+gcd);

        int lcm=(a*b)/gcd;
        System.out.println("Least Common Multiple (LCM) is: "+lcm);
    }
}