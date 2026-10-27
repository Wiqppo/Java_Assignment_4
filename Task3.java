import java.util.Scanner;

public class Task3 {
    static void printInvertedPyramid(int n) {
        for (int row = 0; row < n; row++) {
            for (int star = 0; star < 2 * (n - row) - 1; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printInvertedPyramid(n);
    }
}