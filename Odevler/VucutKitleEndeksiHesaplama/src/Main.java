import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vucut Kitle Endeksi Hesaplama Uygulamamiza Hosgeldiniz!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz : ");
        double boy = scanner.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        double endeks = kilo / Math.pow(boy,2);

        System.out.println("Vucut Kitle Endeksiniz : " + endeks);
    }
}