import java.util.Scanner;

public class Q1_Armstrong {
    public static void main(String[] args) {
        int i,rem;double sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scan.nextInt();
        scan.close();
        int original=n;
        int count = String.valueOf(n).length();
        while(n>0){
            rem=n%10;
            sum=sum+Math.pow(rem, count);
            n=n/10;
        }
        if(sum==original)
        {
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not armstrong number");



    }
}
