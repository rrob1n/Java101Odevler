public class Main {
    public static void main(String[] args) {
        // 1.Part ortalama bulma

        int[] sayilar = new int[]{1, 2, 3, 4, 5};
        double toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        double ortalama = toplam / sayilar.length;
        System.out.println(ortalama);

        // 2.Part harmonik ortalama bulma

        double harmonikToplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 1; j <= sayilar[i]; j++) {
                harmonikToplam += 1.0 / j;
            }
        }
        System.out.println(harmonikToplam);

        double harmonikOrtalama = sayilar.length / harmonikToplam;

        System.out.println(harmonikOrtalama);

    }
}