import java.util.Scanner;

public class Rask12 {
    static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(reverseNumber(n));
    }
}