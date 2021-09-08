class bankAccount{
    int accNo;
    String Name;
    String AccType;
    private double balance;

    public void bankAccount(){
        accNo=0;
        Name="user";
        AccType="nil";
        balance=0;
    }
    public bankAccount(int accNo,String Name,double balance){
        this.accNo=accNo;
        this.Name=Name;
        this.AccType="AccType";
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAcc extends bankAccount{

    double fixedDeposit;

    public SavingsAcc(int accNo, String Name, double balance) {
        super(accNo, Name, balance);
        this.AccType="Savings";
        fixedDeposit=50000;
    }

    @Override
    public double getBalance() {
        return (super.getBalance()+fixedDeposit);
    }
}
class CurrentAcc extends bankAccount{
    double cashCredit;

    public CurrentAcc(int accNo, String Name, double balance) {
        super(accNo, Name, balance);
        this.AccType="Current";
        if (balance>10000)
            cashCredit=(.10*balance);
        else
            cashCredit=(.5*balance);
    }

    @Override
    public double getBalance() {
        return (super.getBalance()+cashCredit);
    }
}


public class Q3_Bank {
    public static void main(String[] args) {

        bankAccount s1= new SavingsAcc(1001,"ABCD",28000);
        bankAccount c1= new CurrentAcc(1002,"BLAH",35000);
        System.out.println("Savings Account Balance = : " + s1.getBalance());
        System.out.println("Current Account Balance = : " + c1.getBalance());
        System.out.println("Total cash in the Bank = : " +(s1.getBalance()+c1.getBalance()));

    }
}
//ANOTHER METHOD
/*
class Bank {
    public static int amount=0;

    public static void total(int deposit) {
        amount+=deposit;
    }
    public int balance(){
        return amount;
    }

}
class savings {
    int amount=0;


    public void getAmount(int fixed) {
        amount+=fixed;
        Bank.total(amount);
    }
}
class current extends Bank
{
    int amount=0;

    public void getAmount(int credit) {
        amount+=credit;
        Bank.total(amount);
    }
}class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        savings sav = new savings();
        current cur = new current();
        sav.amount = 1000;
        cur.amount = 1800;
        sav.getAmount(500);
        cur.getAmount(800);
        System.out.println(bank.balance());

    }}
*/
