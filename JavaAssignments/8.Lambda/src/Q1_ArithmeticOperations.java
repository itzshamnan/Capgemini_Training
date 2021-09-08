import java.util.Scanner;

interface Arithmetic{
    int operation(int a,int b);
}

public class Q1_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        Arithmetic addition=(int a,int b) -> (a+b);
        System.out.println("Adiition : "+addition.operation(num1,num2));
        Arithmetic subtraction=(int a,int b) -> (a-b);
        System.out.println("Subtraction : "+subtraction.operation(num1,num2));
        Arithmetic multiplication=(int a,int b) -> (a*b);
        System.out.println("Multiplication : "+multiplication.operation(num1,num2));
        Arithmetic division=(int a,int b) -> (a/b);
        System.out.println("Division : "+division.operation(num1,num2));

    }
}
