import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1500.0;
        int selection;


        int error = 3;
        while (error > 0) {
            System.out.print("Kullanici adinizi giriniz : ");
            String userName = scanner.nextLine();
            System.out.print("Sifrenizi giriniz : ");
            String password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                do {
                    System.out.println("Merhaba! Kodluyoruz Bankasina Hosgeldiniz!");
                    System.out.println("""
                            1 - Para Yatirma
                            2 - Para Cekme
                            3 - Bakiye Sorgulama
                            4 - Cikis Yap""");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    selection = scanner.nextInt();

                    if (selection == 1) {
                        System.out.print("Yatirmak istediginiz tutari giriniz : ");
                        int yatir = scanner.nextInt();
                        balance += yatir;
                    } else if (selection == 2) {
                        System.out.print("Cekmek istediginiz tutari giriniz : ");
                        int cek = scanner.nextInt();
                        if (cek > balance) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            balance -= cek;
                        }
                    } else if (selection == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (selection != 4);
                System.out.println("Tekrar gorusmek uzere!");


                break;

            } else {
                error--;
                System.out.println("Hatali giris.");
                if (error == 0) {
                    System.out.println("Hesabiniz bloke olmustur! Lutfen banka ile iletisime geciniz.");
                }
                System.out.println("Kalan hakkiniz : " + error);
            }
        }

        //ODEV : ayni islemi switch ile yapacagiz. tekrardan yazmayip sadece switch ile olan tarafini
        //       asagida yazacagim.

        /*
        *
        * switch(selection){
        *
        * case 1:
        * System.out.print("Yatirmak istediginiz tutari giriniz : ");
                        int yatir = scanner.nextInt();
        * break;
        * case 2:
        * System.out.print("Cekmek istediginiz tutari giriniz : ");
                        int cek = scanner.nextInt();
                        if (cek > balance) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            balance -= cek;
                        }
        * break;
        * case 3:
        * System.out.println("Bakiyeniz : " + balance);
        * break;
        * case 4:
        * System.out.println("Sistemden cikis yaptiniz.");
        * System.exit(0);
        * break;
        * default: System.out.println("Hatali giris!");break;
        *
        *
        *
        *
        *
        * }
        *
        *
        * */
    }
}