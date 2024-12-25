import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number up to which you want to generate Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series up to " + n + ": ");

        while (num1<=n) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}