package feb18;
import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number to which you want to print the sum");
        int x = scanner.nextInt();
        int i = 1 ;
        int sum = 0;
        while(i <= x){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of n number is : " + sum);
    }
}
