import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Part : Hocanin yaptigi sekil

        int sayi = 0;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Lutfen sayi giriniz : ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 1) {
                toplam += sayi;
            }

        } while (sayi > 0);

        System.out.println("Girdiginiz tek sayilarin toplami : " + toplam);


        // 2. Part : Odev

        System.out.println("------------------------------------");

        int sayi1 = 0;
        int toplam1 = 0;

        do {

            System.out.print("Lutfen Sayi giriniz : ");
            sayi1 = scanner.nextInt();

            if (sayi1 % 4 == 0) {
                toplam1 += sayi1;
            }


        } while (sayi1 % 2 != 1);

        System.out.println("Girdiginiz sayilardan 4 un kati olanlarin toplami : " + toplam1);

    }
}