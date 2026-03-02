import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = sc.nextLine();

        // Convert to character array
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result in required format
        System.out.println("Is Palindrome: " + isPalindrome);

        sc.close();
    }
}