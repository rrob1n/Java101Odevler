import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ucgenin satir sayisini giriniz : ");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= (satir - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Odev : Elmas yap(yukaridaki ucgenin tersini ekleyecegim ve elmas olacak)

        for (int i = 0; i < satir; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (satir - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}