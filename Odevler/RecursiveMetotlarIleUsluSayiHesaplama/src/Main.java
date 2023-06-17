import java.util.Scanner;

public class Main {
    public static int Us(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * Us(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Recursive Metot ile Us Hesaplama Programina Hosgeldiniz!");
        System.out.print("Ussunun alinmasini istediginiz sayiyi giriniz : ");
        int a = scanner.nextInt();
        System.out.print("Hangi sayiyla ussu alinsin : ");
        int b = scanner.nextInt();

        int sonuc = Us(a, b);
        System.out.println("Islemin sonucu : " + sonuc);
    }

}