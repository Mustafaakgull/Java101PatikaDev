public class Hesap
{
    private String kullaniciadi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciadi, String parola, int bakiye)
    {
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void parayatir(int tutar)
    {
        bakiye=bakiye+tutar;
        System.out.println("yeni bakiyeniz: "+bakiye);
    }
    public void paracek(int tutar)
    {
        if(bakiye<tutar){
            System.out.println("yeterli bakiyeniz yoktur.!.!.");
        }
        else{
            bakiye=bakiye-tutar;
            System.out.println("yeni bakiyeniz: "+bakiye);
        }
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }
}
