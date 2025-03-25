package feb23;
import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Bank bank = new Bank(123,1000);
        double balance = bank.currentBal();

        System.out.println(("Your Current Balance is : ") + bank.currentBal());

        System.out.println("Please Enter the amount you want to deposit");
        double damount = scanner.nextDouble();
        System.out.println("Your new balance after deposit is :  "+ bank.deposit(damount));

        System.out.println("Please Enter the amount you want to withdraw");
        double wamount = scanner.nextDouble();
        System.out.println("Your new balance after withdraw is :  "+ bank.withdraw(wamount));

        System.out.println(("Your Current Balance is : ") + balance);

    }
}
