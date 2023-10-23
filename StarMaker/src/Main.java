import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Elmas deseninin yüksekliğini girin (tek sayı): ");
        int yukseklik = input.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
            return;
        }

        int yariYukseklik = yukseklik / 2 + 1;

        for (int i = 1; i <= yariYukseklik; i++) {
            for (int j = 1; j <= yariYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yariYukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yariYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
