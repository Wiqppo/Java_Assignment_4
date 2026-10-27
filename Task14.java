import java.util.Scanner;

public class Task14 {
    static int transformDigits(int n) {
        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;
            int transformedDigit = (digit % 2 == 0) ? digit + 1 : digit - 1;

            result += transformedDigit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(transformDigits(n));
    }
}