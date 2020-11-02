package saroj;

public class Bank {
    double accountBalance;

public Bank(double accountBalance) {
 this.accountBalance = accountBalance;


}
public void addMoney(double amount){
    this.accountBalance = accountBalance+amount;
}
public void withDrawMoney(double minusAmount){
    this.accountBalance = accountBalance-minusAmount;
    if (accountBalance<=0){
        System.out.println("you account is in minus");
    }
}

}




