import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        int ilkSayi = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        int ikinciSayi = scanner.nextInt();
        int ebob = 1;

        int enBuyuk = 0;

        if (ilkSayi > ikinciSayi) {
            enBuyuk = ilkSayi;
        } else {
            enBuyuk = ikinciSayi;
        }

        for (int i = 1; i <= enBuyuk; i++) {
            if (ilkSayi % i == 0 && ikinciSayi % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Girdiginiz sayilarin ebobu : " + ebob);

        int ekok = 1;

        ekok = (ilkSayi * ikinciSayi) / ebob;

        System.out.println("Girdiginiz sayilarin ekoku : " + ekok);
    }
}