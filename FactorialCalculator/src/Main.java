import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int total1=1;
        int total2=1;
        int total3=1;
        for(int i=1;i<=num1;i++){
            total1=total1*i;
        }
        for(int j=1;j<=num2;j++){
            total2=total2*j;
        }

        for(int x=1;x<=num1-num2;x++){
            total3=total3*x;
        }
        int result=total1/(total2*total3);
        System.out.println("Result is: "+result);

    }
}