public class BankAccount {

    private double balance;

    public void deposit (double amountIn) {
        balance += amountIn;
    }
    public void withdraw (double amountOut) {
        if (amountOut <= balance) {
            balance = balance - amountOut;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double checkBalance () {
        return balance;
    }
}
