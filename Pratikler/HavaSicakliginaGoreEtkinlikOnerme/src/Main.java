import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 1. Part : hocanin yontemi
        //2. Part : Odev


        // 1. Part

        int sicaklik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sicaklik giriniz : ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (sicaklik >= 5 && sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (sicaklik >= 10) {
                System.out.println("piknige gidebilirsiniz");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }

        System.out.println("------------------");
        // 2. Part
        System.out.println("Sicaklik giriniz :");
        int sicaklik1 = scanner.nextInt();

        if (sicaklik1 < 5) {
            System.out.println("Kayak yapabilirsiniz");
        }
        if (sicaklik1 >= 5 && sicaklik1 <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik1 >= 10 && sicaklik1 <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }


    }
}