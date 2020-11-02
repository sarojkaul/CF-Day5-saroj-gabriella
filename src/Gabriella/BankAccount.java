package Gabriella;

public class BankAccount {
    String Owner;
    Float Balance;

    //constructor******************************
    public BankAccount(String owner, Float balance) {
        this.Owner = owner;
        this.Balance = balance;
    }


  //Methods***********************

    public void getAccountDetails(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Account owner:    "+ Owner.toUpperCase()+"    Balance: "+Balance);

    }

    public BankAccount addMoney(float x){
        this.Balance += x;

        this.getAccountDetails();
        if (this.Balance < 0){
            System.out.println("Take care! Your Account Balance is smaller than 0! ");
        }
        return this;
    }

    public void withDrawMoney(float x){
        this.Balance -= x;

        this.getAccountDetails();
        if (this.Balance < 0){
            System.out.println("Take care! You do not have enough Money for this transaction! ");

        }
    }

}
