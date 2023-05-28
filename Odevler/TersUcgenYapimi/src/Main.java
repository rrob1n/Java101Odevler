import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ters Ucgen Yapimina Hosgeldiniz!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac basamakli ters ucgen olusturmak istersiniz giriniz : ");
        int basamak = scanner.nextInt();


        for (int i = 0; i <= basamak; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (basamak - i) * 2 - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}