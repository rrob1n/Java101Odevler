public class Main {
    public static void main(String[] args) {

        System.out.println("1-100 Arasi Asal Sayilari Bulan Programa Hosgeldiniz!");

        System.out.println("1 ile 100 arasindaki asal sayilar asagidakilerdir : ");
        int bolenSayisi = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){
                    bolenSayisi++;
                }
            }
            if (bolenSayisi == 2){
                System.out.print(i + " ");
            }
            bolenSayisi = 0;
        }
    }
}