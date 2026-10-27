import java.util.Scanner;

public class Task4 {
    static void printMatrix(int n, int m) {
        int value = 1;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (col > 0) {
                    System.out.print(" ");
                }
                System.out.print(value++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        printMatrix(n, m);
    }
}