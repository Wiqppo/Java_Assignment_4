import java.util.Scanner;

public class Task2 {
    static void printHollowSquare(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == n - 1) {
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

        printHollowSquare(n);
    }
}