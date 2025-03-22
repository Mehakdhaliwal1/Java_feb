package feb15;
import  java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the first number");
        int x = scanner.nextInt();

        System.out.println("Please Enter the Second number");
        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println("Sum of both number is : " + sum);
    }
}
