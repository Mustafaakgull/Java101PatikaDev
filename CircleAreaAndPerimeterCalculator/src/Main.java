import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter= 2 * Math.PI * radius;
        System.out.println("Area of circle is: " + area);
        System.out.println("Perimeter of circle is: " + perimeter);


    }
}