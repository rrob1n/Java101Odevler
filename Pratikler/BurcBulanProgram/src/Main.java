import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogdugunuz ayi giriniz : ");
        int ay = scanner.nextInt();
        System.out.print("Dogdugunuz gunu giriniz : ");
        int gun = scanner.nextInt();


        // 1. Part : Switch ile
        if (gun > 31) {
            System.out.println("Hatali giris!");
            System.exit(0);
        }
        switch (ay) {
            case 1:
                if (gun < 22) {
                    System.out.println("Oglak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
                break;
            case 2:
                if (gun < 20) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balik Burcu");
                }
                break;
            case 3:
                if (gun < 21) {
                    System.out.println("Balik Burcu");
                } else {
                    System.out.println("Koc Burcu");
                }
                break;
            default:
                System.out.println("Hatali giris.");
        }

        // 2. Part

        if (ay == 1 || ay == 11) {
            if (ay == 11 && gun > 22 ){
                System.out.println("Oglak Burcusunuz.");
            } else if (ay == 1 && gun < 22) {
                System.out.println("Oglak Burcusunuz.");
            }
        } // her ay icin bu sekilde devam edecek
    }
}