import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Fibonacci Serisi!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayisini giriniz : ");
        int sayiInput = scanner.nextInt();

        int birinci = 0;
        int ikinci = 1;

        System.out.print(birinci + " ");
        for (int i = 0; i < sayiInput; i++) {
            System.out.print(ikinci + " ");
            int degistir = birinci + ikinci;

            birinci = ikinci;
            ikinci = degistir;
        }
    }
}