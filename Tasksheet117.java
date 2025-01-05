import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All the numbers are all.");
        } else {
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;

            }
            System.out.println("The largest number is: " + largest);
        }
        scanner.close();
    }
}
