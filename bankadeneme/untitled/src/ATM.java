import java.util.Scanner;

public class ATM
{
    Scanner scan=new Scanner(System.in);
    public void calis(Hesap hesap){
        logIn login=new logIn();

        System.out.println("BANKAMIZA HOŞGELDİNİZ......");
        System.out.println("*****************************");
        System.out.println("kullanıcı girişi.....");
        int girishakki=3;
        while(true)
        {
            if(login.login(hesap)){
                System.out.println("giriş başarılı....");
                break;
            }
            else{
                System.out.println("giriş başarısız...");
                girishakki--;
                System.out.println("kalan giriş hakkı: "+girishakki);
            }
            if(girishakki==0)
            {
                System.out.println("giriş hakkınız bitmiştir!!!!!");
                return;
            }
        }

        System.out.println("*********************");
        String islemler= "1. Bakiye görüntüle\n"
        +"2. Para yatırma\n"+
        "3. Para çekme\n"+
        "4. çıkış için q ya basınız";

        System.out.println(islemler);
        System.out.println("***********************");
        while(true)
        {
            System.out.println("İŞLEMİ SEÇİNİZ");
            String islem=scan.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutar: ");
                int tutar=scan.nextInt();
                scan.nextLine();
                hesap.parayatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("çekmek istediğiniz tutar: ");
                int tutar= scan.nextInt();
                scan.nextLine();
                hesap.paracek(tutar);
            }else{
                System.out.println("geçersiz işlem!!!");
            }
        }
    }
}
