import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.Adim : Kullanicidan deger al

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz : ");
        double tutar = scanner.nextDouble();

        final double KDV_ORAN = 0.18;

        System.out.println("KDV orani : " + KDV_ORAN);

        //2.Adim : KDV tutarini hesapla

        double kdvTutar = tutar * KDV_ORAN;
        System.out.println("KDV tutari : " + kdvTutar);

        //3.Adim : toplam tutari hesapla

        double toplamTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutari : " + tutar);
        System.out.println("KDV'li tutari : " + toplamTutar);
    }
}