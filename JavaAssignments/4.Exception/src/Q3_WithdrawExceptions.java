class IllegalBankTransactionException extends RuntimeException
{
    private String msg;

    public IllegalBankTransactionException(String msg){
        // String-arg constructor
        this.msg=msg;
    }
    public String getMessage() {
        return msg;
    }

}
class InsufficientBalanceException extends RuntimeException{
    private String msg;

    public InsufficientBalanceException(String msg){
        // String-arg constructor
        this.msg=msg;
    }
    /*public InsufficientBalanceException(Throwable cause, String message) {
        super(cause);
        this.msg = msg;
    }*/

    public String getMessage() {
        return msg;
    }

}
class savings {
    //int id;
    private double balance = 5000;

    public void getBalance() {
        System.out.println("Your Balance is : " + balance);
    }


    public void withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else if (amount < 0) {
            throw new IllegalBankTransactionException("Invalid Amount");
        }
        balance -= amount;
        System.out.println("Your balance after withdrawing " + amount + " is " + balance);
    }
}
    public class Q3_WithdrawExceptions {
        public static void main(String[] args) {
            savings user=new savings();
            user.getBalance();
            user.withdraw(5300);


        }
        }



