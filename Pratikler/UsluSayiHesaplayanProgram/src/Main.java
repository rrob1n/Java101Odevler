import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen sayiyi giriniz : ");
        int sayiInput = scanner.nextInt();
        System.out.print("Lutfen ussu giriniz : ");
        int us = scanner.nextInt();

        int sonuc = 1;
        int i = 0;
        while(i < us){
            i++;

            sonuc *= sayiInput;
        }

        System.out.println("Sonuc : " + sonuc);


        // Odev : for dongusu ile yap.

        System.out.print("Lutfen sayiyi giriniz : ");
        int sayiInput1 = scanner.nextInt();
        System.out.print("Lutfen ussu giriniz : ");
        int us1 = scanner.nextInt();

        int toplam = 1;
        for (int j = 0; j < us1 ; j++) {
            toplam *= sayiInput1;
        }

        System.out.println("Sonuc : " + toplam);
    }
}