import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physic,chemistry,music,history,turkish;
        Scanner scan=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        math=scan.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        physic=scan.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        chemistry=scan.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        music=scan.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        history=scan.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkish=scan.nextInt();

        int total=math+physic+chemistry+music+history+turkish;
        double result=(double)total/6;
        System.out.println("Ortalamanız:"+result);
        String average = (result > 60) ? "Geçtiniz. :) " : "Kaldınız.  ";
        System.out.println(average);

    }
}