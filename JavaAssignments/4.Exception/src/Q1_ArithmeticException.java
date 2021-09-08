import java.util.Scanner;

public class Q1_ArithmeticException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = scan.nextInt();
        System.out.println("Enter Second number");
        int b = scan.nextInt();
        try {
            int c = a / b;
            System.out.println(a + " divided by " + b + " is " + c);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
