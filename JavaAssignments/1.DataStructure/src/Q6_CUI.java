import java.util.Scanner;

public class Q6_CUI {
    public static void main(String[] args)
    {
        int i=0,pw=1234,count=0;
        String user="username";

        Scanner scan=new Scanner(System.in);
        while(i<3)
        {
            System.out.println("Enter the username");
            String user1=scan.next();
            System.out.println("Enter the Password");
            int pw1=scan.nextInt();
            if(user1.equals(user) && pw1==pw)
            {
                System.out.println("Welcome");
                System.exit(0);
            }
            i++;
            count++;
            System.out.println("Invalid credentials, please try again");
        }
        if(count==3) {
            System.out.println("Contact admin");
        }
    }
}
