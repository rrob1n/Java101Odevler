import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean uygunChecker(int sayi) {
        if (sayi > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("-----Dizideki Elamanlari Siralama-----");
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
        // 1. yontem for dongusu ile
        int buyuk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i+1; j < sayilar.length ; j++) {
                int temp = sayilar[i];
                if (sayilar[j] < sayilar[i]){
                    sayilar[i] = sayilar[j];
                    sayilar[j] = temp;
                }
            }
        }
        // 2. yontem arrays sort ile
        // Array.sort(sayilar);
        String array = Arrays.toString(sayilar);
        System.out.println(array);

    }
}