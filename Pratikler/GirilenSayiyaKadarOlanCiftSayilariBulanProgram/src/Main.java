import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Part : Hocanin yaptigi bolum

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 2. Part : Odev

        System.out.println("----------------------------------");
        System.out.print("Sayi giriniz : ");
        int sayi2 = scanner.nextInt();
        int toplam = 0;
        int counter = 0;

        for (int i = 0; i < sayi2; i++) {

            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                System.out.println(i + " sayisi 3 ve 4 e tam bolunur.");
                toplam += i;
                counter += 1;
            }
        }

        System.out.println("Ortalama : " + (toplam / counter));


    }
}