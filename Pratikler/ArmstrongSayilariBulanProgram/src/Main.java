import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int birSayi = scanner.nextInt();

        int tempNumber = birSayi;
        int basamakSayisi = 0;
        int basamakDegeri = 0;
        int sonuc = 0;
        int powerResult = 1;

        //Basamak sayisini buluruz.
        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakSayisi++;
        }

        tempNumber = birSayi;

        // Bir sayinin son basamagini bulmak
        // sayi % 10

        while (tempNumber != 0) {
            basamakDegeri = tempNumber % 10;
            powerResult = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                powerResult *= basamakDegeri;
            }
            sonuc += powerResult;
            tempNumber /= 10;

        }

        if (sonuc == birSayi) {
            System.out.println("Girdiginiz sayi bir armstrong sayidir.");
        } else {
            System.out.println("Girdiginiz sayi bir armstrong sayi degildir.");
        }


        // Odev : Bir sayinin basamak sayilarinin toplamini bulan programi yaziniz.

        System.out.println("----------------------------------------------------------------");
        System.out.print("Lutfen bir sayi giriniz : ");
        int ikiSayi = scanner.nextInt();
        int basamakToplam = 0;
        while (ikiSayi != 0){
            basamakToplam += ikiSayi % 10;
            ikiSayi /= 10;
        }

        System.out.println("Girdiginiz sayinin basamak degerlerinin toplami : " + basamakToplam);

    }
}