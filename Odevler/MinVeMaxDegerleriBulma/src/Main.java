import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz : ");
        int girilenSayi = scanner.nextInt();
        int enBuyuk = 0;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 1; i <= girilenSayi; i++) {
            System.out.print(i + ". Sayiyi giriniz : ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

            System.out.println(enKucuk);
        }

        System.out.println("Girdiginiz sayilardan en buyugu : " + enBuyuk);
        System.out.println("Girdiginiz sayilardan en kucugu : " + enKucuk);
    }
}