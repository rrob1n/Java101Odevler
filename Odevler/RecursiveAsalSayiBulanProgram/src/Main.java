import java.util.Scanner;

public class Main {

    public static boolean asalMi(int sayi,int bolen){
        if (sayi < 2) {
            return false;
        }
        if (sayi == 2){
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi){
            return true;
        }
        return asalMi(sayi, bolen +1);
    }

    public static void main(String[] args) {

        System.out.println("Asal Sayi Bulma Programina Hosgeldiniz!");
        System.out.print("Bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        if (asalMi(sayi,2)){
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}