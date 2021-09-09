import java.util.Scanner;
//Simple and Compound Interest
public class Q3_Interest {
    public static double simple(double p,double r,double t)
    {
        double si=(p*r*t)/100;
        return si;
    }
    public static double compound(double p,double r,double t)
    {
        double amount=p * Math.pow(1 + (r / 100), t);
        double ci=amount-p;
        return ci;

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double a= scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        double b= scan.nextDouble();
        System.out.print("Enter the number of years: ");
        double c= scan.nextDouble();
        System.out.println("Simple Interest : "+simple(a,b,c)+" Total amount :"+(a+simple(a,b,c)));
        System.out.println("Compund Interest : "+compound(a,b,c)+" Total amount :"+(a+compound(a,b,c)));

    }

}
