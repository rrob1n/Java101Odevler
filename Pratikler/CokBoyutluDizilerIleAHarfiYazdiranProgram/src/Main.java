import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] harf = new String[6][4];
        for (int i = 0; i < harf.length; i++) {
            for (int j = 0; j < harf[i].length; j++) {
                if (i == 0 || i == 2) {
                    harf[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    harf[i][j] = " * ";
                } else {
                    harf[i][j] = "   ";
                }
            }
        }
        for (String[] satir : harf) {
            for (String sutun:satir){
                System.out.print(sutun);
            }
            System.out.println();
        }
    }
}