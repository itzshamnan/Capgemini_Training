import org.junit.Test;

class BankAccountTest {
    @Test
    public void withdraw() {
    }

    @Test
    public void deposit() {
    }

    @Test
    public void getBalance() {
    }

    @Test(expected = RuntimeException.class)
    public void test1(){                //testing insufficient balance
        BankAccount acc1 = new BankAccount();
        acc1.deposit(1000);
        acc1.withdraw(-100);  //testing for negative amount
    }

}