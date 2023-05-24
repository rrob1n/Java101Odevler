import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayiInput = scanner.nextInt();

        for (int i = 1; i < sayiInput; i *= 2) {
            System.out.println(i);
        }

        // Odev : Girilen sayiya kadar 4 ve 5 in kuvvetlerini ekrana yazdir

        System.out.print("Bir sayi giriniz : ");
        int sayiInput2 = scanner.nextInt();

        for (int i = 20; i < sayiInput2; i += 4) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}