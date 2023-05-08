import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Part :  Buyukten kucuge siralama
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk degeri giriniz : ");
        a = scanner.nextInt();

        System.out.print("Ikinci degeri giriniz : ");
        b = scanner.nextInt();

        System.out.print("Ucuncu degeri giriniz : ");
        c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b ");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }

        // 2. Part : Kucukten buyuge siralama

        System.out.println("-----------");

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else if (c < a && c < b){
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}