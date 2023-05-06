import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;
        int hesaplanacakDers = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Matematik notunuzu giriniz : ");
        mat = scanner.nextInt();
        if (mat > 100 || mat < 0){
            mat = 0;
            hesaplanacakDers -= 1;
            System.out.println("Notunuz hatali girilmistir ortalamaniza eklenmeyecektir!");
        }

        System.out.print("Lutfen Fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();
        if (fizik > 100 || fizik < 0){
            fizik = 0;
            hesaplanacakDers -= 1;
            System.out.println("Notunuz hatali girilmistir ortalamaniza eklenmeyecektir!");
        }

        System.out.print("Lutfen Kimya notunuzu giriniz : ");
        kimya = scanner.nextInt();
        if (kimya > 100 || kimya < 0){
            kimya = 0;
            hesaplanacakDers -= 1;
            System.out.println("Notunuz hatali girilmistir ortalamaniza eklenmeyecektir!");
        }

        System.out.print("Lutfen Turkce notunuzu giriniz : ");
        turkce = scanner.nextInt();
        if (turkce > 100 || turkce < 0){
            turkce = 0;
            hesaplanacakDers -= 1;
            System.out.println("Notunuz hatali girilmistir ortalamaniza eklenmeyecektir!");
        }

        System.out.print("Lutfen Muzik notunuzu giriniz : ");
        muzik = scanner.nextInt();
        if (muzik > 100 || muzik < 0){
            muzik = 0;
            hesaplanacakDers -= 1;
            System.out.println("Notunuz hatali girilmistir ortalamaniza eklenmeyecektir!");
        }

        double ortalama = (mat + fizik + kimya + turkce + muzik) /(double) hesaplanacakDers;

        if (ortalama <= 55){
            System.out.println("Sinifta kaldiniz seneye tekrardan gorusmek uzere.");

        }else {
            System.out.println("Tebrikler sinifi gectiniz.");
        }

        System.out.println("Ortalamaniz : " + ortalama);
    }
}