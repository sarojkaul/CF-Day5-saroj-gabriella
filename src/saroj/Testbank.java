package saroj;

public class Testbank {

    public static void main(String[] args) {

        //Bank bank1 = new Bank();
       // System.out.println(bank1.accountBalance);
        //bank1.addMoney(1200);
        //System.out.println(bank1.accountBalance);
        Bank bank2 = new Bank(2000);
        System.out.println(bank2.accountBalance);
       // System.out.println(bank2.accountBalance);
        bank2.withDrawMoney(11000);
        System.out.println(bank2.accountBalance);




    }
}
