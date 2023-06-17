import java.util.Scanner;

public class Main {
    public static void fonksiyonumuz(int sayi) {

        if (sayi <= 0) {
            System.out.print(sayi + " ");
        } else {
            System.out.print(sayi + " ");
            fonksiyonumuz(sayi - 5);
            System.out.print(sayi + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Desene Gore Metot Olusturma");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int birSayi = scanner.nextInt();

        fonksiyonumuz(birSayi);
    }
}