import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static boolean uygunChecker(int sayi) {
        if (sayi > 0) {
            return true;
        }
        return false;
    }

    public static int frekansBul(int[] array, int bulunacakSayi) {
        int tekrarSayisi = 0;
        for (int sayi : array) {
            if (sayi == bulunacakSayi) {
                tekrarSayisi++;
            }
        }
        return tekrarSayisi;
    }


    public static void main(String[] args) {
        System.out.println("-----Dizideki Elemanlarin Frekansi-----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin buyuklugunu giriniz(0 dan buyuk olsun) : ");
        int dizininBuyuklugu = scanner.nextInt();

        while (!uygunChecker(dizininBuyuklugu)) {
            System.out.print("Dizinin buyuklugunu giriniz(0 dan buyuk olsun) : ");
            dizininBuyuklugu = scanner.nextInt();
        }

        int[] sayilar = new int[dizininBuyuklugu];
        System.out.println("Dizinin elemanlarini giriniz : ");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". Elemani : ");
            int eleman = scanner.nextInt();

            sayilar[i] = eleman;
        }

        System.out.print("Hangi sayinin frekansini bulmak istersiniz(cikis yapmak icin (-1) yazin) : ");
        int bulunacakSayi = scanner.nextInt();
        System.out.print(bulunacakSayi + " sayisi dizide " + frekansBul(sayilar, bulunacakSayi) + " kere tekrar edildi.");
        System.out.println();
        while (bulunacakSayi != -1) {
            System.out.print("Hangi sayinin frekansini bulmak istersiniz(cikis yapmak icin (-1) yazin) : ");
            bulunacakSayi = scanner.nextInt();
            if (bulunacakSayi == -1){
                System.out.println("Cikis yapiliyor...");
                break;
            }
            System.out.print(bulunacakSayi + " sayisi dizide " + frekansBul(sayilar, bulunacakSayi) + " kere tekrar edildi.");
            System.out.println();

        }

    }


}