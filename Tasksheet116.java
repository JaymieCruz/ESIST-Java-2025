import java.util.Scanner;

public class Tasksheet116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder reversedStringBuilder = new StringBuilder(inputString);
        String reversedString = reversedStringBuilder.reverse().toString();

        if (inputString.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }081920

        scanner.close();
    }
}