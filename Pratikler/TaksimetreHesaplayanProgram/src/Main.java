import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Taksimetre Km basine : 2.20 TL tutuyor
        // Minimum odenecek tutar 20TL dir. 20 tl nin altindaki ucretlerde yine 20tl alinacaktir
        // Taksimetre acilis ucreti 10TL dir

        double kmTutar = 2.20;
        double minTutar = 20;
        double acilis = 10;
        double total = 0;
        
        System.out.println("Odenebilecek minimum tutar : " + minTutar);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        int kmInput = scanner.nextInt();

        total += (kmTutar * kmInput) + acilis;
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar : " + total);

        scanner.close();

    }
}