import java.util.Scanner;

public class Task13 {
    static void printXPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col || row + col == n - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printXPattern(n);
    }
}