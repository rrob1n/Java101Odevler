import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.part
        int[] sayilar = new int[]{6, 2, 3, 21, -5};
        int enKucuk;
        int enBuyuk;

        enKucuk = sayilar[0];
        enBuyuk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk){
                enBuyuk = sayilar[i];
            }
            if (sayilar[i] < enKucuk){
                enKucuk = sayilar[i];
            }
        }
        System.out.println("En buyuk : " + enBuyuk);
        System.out.println("En Kucuk : " + enKucuk);

        //2.part
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        int sayiInput = scanner.nextInt();

        int kucukEnYakin = 0;
        int buyukEnYakin = 0;

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > sayiInput){
                buyukEnYakin = sayilar[i];
                break;
            }
            if (sayilar[i] < sayiInput){
                kucukEnYakin = sayilar[i];
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin : " + kucukEnYakin);
        System.out.println("Girilen sayidan buyuk en yakin : " + buyukEnYakin);

    }
}