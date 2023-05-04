import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yaricap degerini giriniz : ");
        int yaricap = scanner.nextInt();

        final double PI = 3.14;

        double alan = PI * Math.pow(yaricap,2);
        double cevre = 2 * PI * yaricap;
        
        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);
    }
}