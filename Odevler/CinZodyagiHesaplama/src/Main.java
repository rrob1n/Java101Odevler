import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz : ");
        int year = scanner.nextInt();
        String burc = "";

        int kalan = year % 12;

        if (kalan == 0) {
            burc = "Maymun";
        } else if (kalan == 1) {
            burc = "Horoz";
        } else if (kalan == 2) {
            burc = "Kopek";
        } else if (kalan == 3) {
            burc = "Domuz";
        } else if (kalan == 4) {
            burc = "Fare";
        } else if (kalan == 5) {
            burc = "Okuz";
        } else if (kalan == 6) {
            burc = "Kaplan";
        } else if (kalan == 7) {
            burc = "Tavsan";
        } else if (kalan == 8) {
            burc = "Ejderha";
        } else if (kalan == 9) {
            burc = "Yilan";
        } else if (kalan == 10) {
            burc = "At";
        } else if (kalan == 11) {
            burc = "Koyun";
        }

        System.out.println("Cin Zodyagi Burcunuz : " + burc);


    }
}