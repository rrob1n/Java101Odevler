import java.util.Scanner;

public class Main {

    public static int fibonacci(int i) {

        if (i == 1 || i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci serisinin kacinci elemanini bulmak istersin : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input+". eleman : " + fibonacci(input));
    }
}