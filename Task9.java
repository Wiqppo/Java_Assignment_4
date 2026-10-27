public class Task9 {
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        boolean first = true;

        for (int n = 100; n <= 999; n++) {
            if (isArmstrong(n)) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(n);
                first = false;
            }
        }

        System.out.println();
    }
}