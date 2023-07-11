import java.util.Arrays;

public class Main {
    public static boolean sayiVarMi(int[] array,int sayi){
        for (int arrayeleman:array) {
            if (arrayeleman == sayi){
                return true;
            }
        }
        return false;
    }
    public static int ciftGetter(int sayi){
        if (sayi%2 == 0){
            return sayi;
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] sayilar = new int[]{3, 7, 3, 3, 2,2, 9, 18, 23, 1, 33, 9, 1,4,4,6,6,7,7};
        int[] tekrarEdenler = new int[sayilar.length];


        for (int i = 0; i < sayilar.length; i++) {
            int arayan = sayilar[i];

            for (int j = i + 1; j < sayilar.length; j++) {
                if (arayan == sayilar[j]&& !sayiVarMi(tekrarEdenler, arayan)) {
                    tekrarEdenler[i] = arayan;
                }
            }
        }
        Arrays.sort(tekrarEdenler);
        for (int sayi:tekrarEdenler) {
            if (sayi != 0){
                System.out.print(sayi + " ");
            }
        }
        System.out.println();
        // cift tekrar eden sayilari yazdirma
        for (int sayi:tekrarEdenler) {
            if (ciftGetter(sayi) != 0){
                System.out.println(sayi);
            }
        }

    }
}