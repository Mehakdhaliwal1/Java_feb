package feb18;
import java.util.Scanner;

public class DoWhileSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number till you want to print sum");
        int x = scanner.nextInt();

        int i = 1;
        int sum = 0;

        do{
            sum = sum + i;
            i++;
        }while(i<=x);
        System.out.println("Sum of n numbers is : " + sum);


    }
}
