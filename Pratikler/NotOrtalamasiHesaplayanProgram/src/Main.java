import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.Adim: Degiskenleri olustur.

        int mat,fizik,kimya,turkce,tarih,muzik;

        //2.Adim: Scanneri ekle ve kullanicidan deger al.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik dersinin notunu giriniz : ");
        mat = scanner.nextInt();
        System.out.print("Fizik dersinin notunu giriniz : ");
        fizik = scanner.nextInt();
        System.out.print("Kimya dersinin notunu giriniz : ");
        kimya = scanner.nextInt();
        System.out.print("Turkce dersinin notunu giriniz : ");
        turkce = scanner.nextInt();
        System.out.print("Tarih dersinin notunu giriniz : ");
        tarih = scanner.nextInt();
        System.out.print("Muzik dersinin notunu giriniz : ");
        muzik = scanner.nextInt();

        double toplamNot = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplamNot / 6.0;

        System.out.println("Not ortalamaniz : " + ortalama);

        //3.Adim(bu adim opsiyoneldir): Gecip gecmedigimizi kontrol etmek

        if (ortalama >= 60){
            System.out.println("Tebrikler! Gectiniz.");
        }else{
            System.out.println("Kaldiniz.");
        }
    }
}