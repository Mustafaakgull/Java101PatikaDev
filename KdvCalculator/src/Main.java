import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the price of product: ");
        double price = scan.nextDouble();
        double newprice=price+price*0.18;
        System.out.println("Here is your total amount: "+newprice);
        System.out.println("Here is kdv amount:"+ (price*0.18));
    }
}