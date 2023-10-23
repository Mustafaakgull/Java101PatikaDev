import java.util.Scanner;

public class logIn
{
    public boolean login(Hesap hesap)
    {
        Scanner scan = new Scanner(System.in);
        String kullaniciadi;
        String parola;
        System.out.println("kullanıcı adı: ");
        kullaniciadi = scan.nextLine();
        System.out.println("Parola: ");
        parola = scan.nextLine();

        if (hesap.getKullaniciadi().equals(kullaniciadi) && hesap.getParola().equals(parola)) {
            return true;
        }
        else {
        return false;
        }
    }
}
