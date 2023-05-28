import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mukemmel Sayi Bulan Programa Hosgeldiniz!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int birSayi = scanner.nextInt();

        int bolenlerininToplami = 0;

        for (int i = 1; i < birSayi; i++) {
            if (birSayi % i == 0) {
                bolenlerininToplami += i;
            }
        }

        if (bolenlerininToplami == birSayi) {
            System.out.println(birSayi + " Mukemmel sayidir");
        } else {
            System.out.println(birSayi + " Mukemmel sayi degildir.");
        }

    }
}