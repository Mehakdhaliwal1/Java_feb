package feb18;
import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number till you want to print the even number sum");
        int x = scanner.nextInt();

        int sum = 0 ;
        int i = 1;
        while(i<=x){
            if(i % 2 == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of N even numbers is : " + sum);
    }
}
