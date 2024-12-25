import java.util.Scanner;
class EligibleOrNotEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of person");
        int age = sc.nextInt();
        String rs = (age>18)?"Eligible":"Not Eligible";
        System.out.println(rs);
    }

}
