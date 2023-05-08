import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("********** Patika Hava Yollarina Hosgeldiniz **********");

        double km;
        int yas;
        int biletTipi;
        double toplam = 0;
        double indirimliFiyat = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz : ");
        km = scanner.nextDouble();

        if (km < 0) {
            System.out.println("Hatali giris yaptiniz.");
            System.exit(0);
        }

        System.out.print("Yasinizi giriniz : ");
        yas = scanner.nextInt();

        if (yas < 0 || yas > 120){
            System.out.println("Hatali giris yaptiniz.");
            System.exit(0);
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidis Dönüs) : ");
        biletTipi = scanner.nextInt();

        if (biletTipi > 2 || biletTipi < 1) {
            System.out.println("Hatali giris yaptiniz.");
            System.exit(0);
        }

        toplam += km * 0.10;

        if (yas < 12) {
            indirimliFiyat = toplam / 2;
            if (biletTipi == 2) {

                indirimliFiyat = (indirimliFiyat * 0.8) * 2;
                System.out.println("Toplam tutar : " + indirimliFiyat);
            } else {
                System.out.println("Toplam tutar : " + indirimliFiyat);
            }
        } else if (yas > 12 && yas < 24) {
            indirimliFiyat = toplam * 0.9;
            if (biletTipi == 2) {

                indirimliFiyat = (indirimliFiyat * 0.8) * 2;
                System.out.println("Toplam tutar : " + indirimliFiyat);
            } else {
                System.out.println("Toplam tutar : " + indirimliFiyat);
            }
        } else if (yas > 65) {
            indirimliFiyat = toplam * 0.7;
            if (biletTipi == 2) {

                indirimliFiyat = (indirimliFiyat * 0.8) * 2;
                System.out.println("Toplam tutar : " + indirimliFiyat);
            } else {
                System.out.println("Toplam tutar : " + indirimliFiyat);
            }
        } else {
            if (biletTipi == 2) {

                toplam = (toplam * 0.8) * 2;
                System.out.println("Toplam tutar : " + toplam);
            } else {
                System.out.println("Toplam tutar : " + toplam);
            }
        }


    }
}