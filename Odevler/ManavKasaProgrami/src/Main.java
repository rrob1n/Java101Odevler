import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Meyveler ve Kg fiyatlari

        double armut = 2.14;
        double elma =  3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double toplam = 0;

        System.out.println("Marketimize Hosgeldiniz!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen kac kilo armut almak istediginizi giriniz : ");
        int armutAdet = scanner.nextInt();

        toplam += armut * armutAdet;

        System.out.print("Lutfen kac kilo elma almak istediginizi giriniz : ");
        int elmaAdet = scanner.nextInt();

        toplam += elma*elmaAdet;

        System.out.print("Lutfen kac kilo domates almak istediginizi giriniz : ");
        int domatesAdet = scanner.nextInt();

        toplam += domates*domatesAdet;

        System.out.print("Lutfen kac kilo muz almak istediginizi giriniz : ");
        int muzAdet = scanner.nextInt();

        toplam += muz*muzAdet;

        System.out.print("Lutfen kac kilo patlican almak istediginizi giriniz : ");
        int patlicanAdet = scanner.nextInt();

        toplam += patlican*patlicanAdet;

        System.out.println("Toplam Tutar : " + toplam);
    }
}