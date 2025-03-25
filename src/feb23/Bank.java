package feb23;

public class Bank {
    double accountBal ;
    double accountNo ;

    public Bank(double accountNo, double accountBal) {
        this.accountNo = accountNo;
        this.accountBal = accountBal;
    }

    public double currentBal(){
        return accountBal;
    }

    public double deposit(double amount){
        accountBal = accountBal + amount;
        return accountBal ;
    }
    public  double withdraw(double amount) {
            accountBal = accountBal - amount;
            return accountBal;
        }
}
