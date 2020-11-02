package Gabriella;

public class Bank {
    public static void main(String[] args) {

        BankAccount ba1= new BankAccount("Otto",99000.50f);
        ba1.getAccountDetails();
        ba1.withDrawMoney(500000.00f);
        ba1.addMoney(65000f);

    }
}
