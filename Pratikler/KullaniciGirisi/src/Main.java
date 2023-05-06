import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username;
        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz : ");
        username = scanner.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz!");
        } else {
            System.out.println("Bilgileriniz yanlis!");
            System.out.println("Sifrenizi Degistirmek Istiyorsaniz 1 e istemiyorsaniz 2 ye basin : ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            if (secim == 1){
                System.out.print("Lutfen yeni sifrenizi giriniz : ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(password)){
                    System.out.println("Sifreniz olusturulamadi!");
                }else {
                    System.out.println("Sifreniz olusturuldu! Yeni sifreniz : " + yeniSifre);
                }
            }
            if (secim == 2){
                System.out.println("Basari ile cikis yaptiniz!");
            }
        }
    }
}