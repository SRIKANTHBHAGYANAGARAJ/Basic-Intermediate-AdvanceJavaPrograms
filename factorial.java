import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check for negative input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return; // Exit the program
        }

        long fact = 1; // Use long to handle larger factorials
        int i = 1;
        while (i <= num) {
            fact *= i;
            System.out.println("Current value: " + fact);
            i++;
        }
        System.out.println("Final factorial: " + fact);
    }
}