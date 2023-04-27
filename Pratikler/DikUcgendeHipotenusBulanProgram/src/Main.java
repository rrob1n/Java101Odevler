import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Bu ödev iki parcadan olusuyor.

        1 - Iki kenari verilen ucgenin hipotenusunu bulma
        2- Uc kenar uzunlugunu kullanicidan aldiginiz ucgenin alanini bulma
         */

        // Part - 1

        //1.Adim : Kullanicidan degerleri al, degiskenleri olustur

        Scanner scanner = new Scanner(System.in);

        int ilkKenar,ikinciKenar;
        double hipotenus;

        System.out.print("Ilk kenari giriniz : ");
        ilkKenar = scanner.nextInt();

        System.out.print("Ikınci kenari giriniz : ");
        ikinciKenar = scanner.nextInt();

        //2.Adim : hipotenusun formulunu yaz

        hipotenus = Math.sqrt(Math.pow(ilkKenar,2) + Math.pow(ikinciKenar,2));

        //3.Adim : hipotenusu yazdir

        System.out.println("Verdiginiz degerlere gore hipotenusun degeri budur : " + hipotenus);

        //Part - 2

        //1.Adim : Uc kenar uzunluk degiskenlerini olustur ve kullanicidan al

        int ilkKenar2,ikinciKenar2,ucuncuKenar;
        System.out.print("Ucgenin ilk kenarini giriniz : ");
        ilkKenar2 = scanner.nextInt();
        System.out.print("Ucgenin ikinci kenarini giriniz : ");
        ikinciKenar2 = scanner.nextInt();
        System.out.print("Ucgenin ucuncu kenarini giriniz : ");
        ucuncuKenar = scanner.nextInt();

        //2.Adim : Formulu uygula

        double u = (ilkKenar2 + ikinciKenar2 + ucuncuKenar) / 2.0;

        double cevre = 2*u;
        System.out.println("Ucgenin cevresi : " + cevre);

        double alan = Math.sqrt(u*(u-ilkKenar2)*(u-ikinciKenar2)*(u-ucuncuKenar));
        System.out.println("Ucgenin alani : " + alan);




    }
}