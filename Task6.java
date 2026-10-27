import java.util.Scanner;

public class Task6 {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int countPrimes(int a, int b) {
        int count = 0;

        for (int n = a; n <= b; n++) {
            if (isPrime(n)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Prime Count = " + countPrimes(a, b));
    }
}