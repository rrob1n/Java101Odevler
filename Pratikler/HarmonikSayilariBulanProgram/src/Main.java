import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayiInput = scanner.nextInt();

        double sonuc = 0;
        for (int i = 1; i <= sayiInput ; i++) {
            sonuc +=  (1.0/i);
        }

        System.out.println("Islemin sonucu : " + sonuc);
    }
}