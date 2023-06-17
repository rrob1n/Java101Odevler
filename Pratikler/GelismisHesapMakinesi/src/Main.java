import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void Toplama() {

        System.out.print("Kac tane sayiyi toplamak istersiniz giriniz : ");
        int amount = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i <= amount; i++) {
            System.out.print(i + ". Sayiyi Giriniz : ");
            int sayi = scanner.nextInt();
            toplam += sayi;
        }
        System.out.println("Girdiginiz sayilarin toplami : " + toplam);
        System.exit(0);
    }

    public static void Cikarma() {
        System.out.print("Cikarilacak sayiyi giriniz : ");
        int cikarilacak = scanner.nextInt();
        System.out.print("Cikan sayiyi giriniz : ");
        int cikan = scanner.nextInt();

        if (cikan > cikarilacak) {
            HataVer();
        } else {
            int sonuc = cikarilacak - cikan;
        }
        System.exit(0);
    }

    public static void Carpma() {
        System.out.print("Kac tane sayi carpmak istiyorsunuz : ");
        int amount = scanner.nextInt();
        if (amount == 0) {
            HataVer();
        } else if (amount == 1) {
            System.out.println("Bir tane sayiyi carpamazsiniz");
        }
        int sonuc = 1;
        for (int i = 1; i <= amount; i++) {
            System.out.print("Carpilacak " + i + ". sayiyi giriniz : ");
            int carpilacak = scanner.nextInt();
            sonuc *= carpilacak;
        }
        System.out.println("Carptiginiz sayilarin sonucu = " + sonuc);
        System.exit(0);

    }

    public static void Bolme() {
        System.out.print("Bolunecek sayiyi giriniz : ");
        double bolunen = scanner.nextDouble();
        System.out.print("Kaca bolunecek : ");
        double bol = scanner.nextDouble();

        if (bol > bolunen) {
            HataVer();
        } else {
            double sonuc = bolunen / bol;
            System.out.println("Bolme isleminin sonucu : " + sonuc);
        }
        System.exit(0);
    }

    public static void UsAlma() {
        System.out.print("Ussunun alinmasini istediginiz sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Sayinin ussunu giriniz : ");
        int us = scanner.nextInt();

        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= sayi;
        }
        System.out.println("Isleminizin sonucu : " + sonuc);
        System.exit(0);
    }

    public static void ModAlma() {
        System.out.print("Modunun alinmasini istediginiz sayiyi giriniz : ");
        int mod = scanner.nextInt();
        System.out.print("Hangi sayiyla modunu alacaksiniz : ");
        int islem = scanner.nextInt();

        if (islem > mod) {
            HataVer();
        } else {
            int sonuc = 0;
            sonuc = mod % islem;
            System.out.println("Isleminizin sonucu : " + sonuc);
        }
        System.exit(0);
    }

    public static void Dikdortgen() {
        System.out.print("Dikdortgenin uzun kenarini giriniz : ");
        int uzunKenar = scanner.nextInt();
        System.out.print("Dikdortgenin kisa kenarini giriniz : ");
        int kisaKenar = scanner.nextInt();

        int cevre = (uzunKenar + kisaKenar) * 2;
        int alan = uzunKenar * kisaKenar;

        System.out.println("Dikdortgenin cevresi : " + cevre);
        System.out.println("Dikdortgenin alani : " + alan);
        System.exit(0);
    }

    public static void HataVer() {
        System.out.println("Hatali giris!");
    }

    public static void main(String[] args) {

        System.out.println("-----Hesap Makinemize Hosgeldiniz-----");
        int selection;

        String menu = "1 - Toplama\n" +
                "2 - Cikarma\n" +
                "3 - Carpma\n" +
                "4 - Bolme\n" +
                "5 - Us Alma\n" +
                "6 - Mod Alma\n" +
                "7 - Dikdortgen Alan ve Cevre Hesabi\n" +
                "0 - Cikis Yap";

        System.out.println(menu);

        do {
            System.out.print("Bir islem seciniz : ");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    Toplama();
                    break;
                case 0:
                    System.out.println("Cikis Yapiliyor!");
                    break;
                case 2:
                    Cikarma();
                    break;
                case 3:
                    Carpma();
                    break;
                case 4:
                    Bolme();
                    break;
                case 5:
                    UsAlma();
                    break;
                case 6:
                    ModAlma();
                    break;
                case 7:
                    Dikdortgen();
                    break;
                default:
                    HataVer();
            }
        } while (selection != 0);


    }
}