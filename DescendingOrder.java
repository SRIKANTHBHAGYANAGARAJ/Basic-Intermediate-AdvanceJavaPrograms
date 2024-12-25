import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int big, mid, small;

        if (a >= b && a >= c){
            big = a;
        }
         else if (b >= a && b >= c){
            big = b;
        }
         else {
            big = c;
        }

        if ((a >= b && a <= c) || ( a <= b && a >= c)) {
            mid = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            mid = b;
        } else {
            mid = c;
        }

        if (a <= b && a <= c) {
            small = a;
        } else if (b <= a && b <= c) {
            small = b;
        } else {
            small = c;
        }

        System.out.println("Numbers in descending order: " + big + " " + mid + " " + small);
    }
}