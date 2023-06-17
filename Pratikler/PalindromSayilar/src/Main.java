import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(int number) {

        int temp = number, reverseNumber = 0, lastDigit;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.print("Lutfen bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        boolean output = isPalindrome(input);

        if (output) {
            System.out.println("Girdiginiz sayi palindromdur.");
        } else {
            System.out.println("Girdiginiz sayi palindrom degildir.");
        }


    }
}