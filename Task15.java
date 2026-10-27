import java.util.Scanner;

public class Task15 {
    static boolean isPalindrome(int n) {
        String number = Integer.toString(n);
        int left = 0;
        int right = number.length() - 1;

        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
    }
}