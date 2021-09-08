import java.util.Scanner;

public class Q5_Tax {
    public static void main(String[] args)
    {
        double taax;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the salary");
        int n= scan.nextInt();
        if(n<0)
            System.out.println("Invalid number");
        else if(n<=180000)
            System.out.println("No tax need to be paid");
        else if(n>180000 && n<=300000)
        {
            taax = n * 0.1;
            System.out.println("The tax is " + taax);
        }
        else if(n>300000 && n<=500000) {
            taax = n * 0.2;
            System.out.println("The tax is " + taax);
        }
        else {
            taax = n * 0.3;
            System.out.println("The tax is " + taax);
        }


    }
}
