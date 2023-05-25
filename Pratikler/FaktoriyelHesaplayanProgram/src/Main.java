import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayiInput = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i <= sayiInput; i++) {
            faktoriyel *= i;
        }

        System.out.println("Girdiginiz sayinin faktoriyeli : " + faktoriyel);

        // Odev : N elemanli bir kumenin elemanlari olusturularak r elemanli farkli gruplarin sayisi
        // N in r li kombinasyonu olarak adlandirilir.
        // Kombinasyon formulu : C(n,r) = n! / (r! * (n-r)!)

        System.out.print("Eleman sayisini giriniz :");
        int n = scanner.nextInt();

        System.out.print("Secimi giriniz : ");
        int r = scanner.nextInt();

        int faktoriyel1 = 1;
        int faktoriyel2 = 1;
        int faktoriyel3 = 1;

        for (int i = 1; i <= n; i++) {
            faktoriyel1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            faktoriyel2 *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            faktoriyel3 *= i;
        }

        double sonuc = (double) faktoriyel1 / (faktoriyel2 * faktoriyel3);

        System.out.println("Sonucu : " + sonuc);
    }
}