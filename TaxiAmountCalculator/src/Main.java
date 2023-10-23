import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance in kilometers:");
        double distance = sc.nextDouble();
        double perKm = 2.20, total = 0;
        int start = 10;
        if(perKm*distance<20){
            total = 20;
            System.out.println("Total: " + total);
        }
        else{
            total = perKm*distance+start;
            System.out.println("Total: " + total);
        }
    }
}