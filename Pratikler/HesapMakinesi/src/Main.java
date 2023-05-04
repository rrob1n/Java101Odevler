import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Bu bolum 2 parttan olusmaktadir calismasini istemediginiz parti commentleyiniz
        // 1.Part : IF ELSE
        // 2.Part : Switch - Case

        // 1.Part
        int sayi1;
        int sayi2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        sayi2 = scanner.nextInt();

        int secim;

        System.out.println("Asagida yapabileceginiz islemler yer almaktadir : ");
        System.out.println("1 - Toplama ");
        System.out.println("2 - Cikarma ");
        System.out.println("3 - Carpma ");
        System.out.println("4 - Bolme ");
        System.out.print("Seciminizi giriniz : ");
        secim = scanner.nextInt();

        if (secim == 1) {
            int toplam = sayi1 + sayi2;
            System.out.println("Isleminizin sonucu : " + toplam);
        } else if (secim == 2) {
            int cikarma = sayi1 - sayi2;
            System.out.println("Isleminizin sonucu : " + cikarma);
        } else if (secim == 3) {
            int carpma = sayi1 * sayi2;
            System.out.println("Isleminizin sonucu : " + carpma);
        } else if (secim == 4) {
            if (sayi2 != 0) {
                int bolme = sayi1 / sayi2;
                System.out.println("Isleminizin sonucu : " + bolme);
            } else {
                System.out.println("Bir sayi 0 a bolunemez!");
            }
        } else {
            System.out.println("Hatali giris! Lutfen uygulmayi tekrar calistirin.");
        }


        //2.Part
        int number1;
        int number2;

        System.out.print("Ilk sayiyi giriniz : ");
        number1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        number2 = scanner.nextInt();

        int sec;

        System.out.println("Asagida yapabileceginiz islemler yer almaktadir : ");
        System.out.println("1 - Toplama ");
        System.out.println("2 - Cikarma ");
        System.out.println("3 - Carpma ");
        System.out.println("4 - Bolme ");
        System.out.print("Seciminizi giriniz : ");
        sec = scanner.nextInt();

        switch (sec) {
            case 1:
                int toplam = sayi1 + sayi2;
                System.out.println("Isleminizin sonucu : " + toplam);
                break;
            case 2:
                int cikarma = sayi1 - sayi2;
                System.out.println("Isleminizin sonucu : " + cikarma);
                break;
            case 3:
                int carpma = sayi1 * sayi2;
                System.out.println("Isleminizin sonucu : " + carpma);
                break;
            case 4:
                if (sayi2 != 0) {
                    int bolme = sayi1 / sayi2;
                    System.out.println("Isleminizin sonucu : " + bolme);
                } else {
                    System.out.println("Bir sayi 0 a bolunemez!");
                }
                break;
            default:
                System.out.println("Hatali giris! Lutfen uygulmayi tekrar calistirin.");
        }

    }
}