package feb15;
import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("Welcome to my Calculator");
        System.out.println("*********");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Additon");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divison");
        System.out.println("5.Modulus");
        System.out.println("6.Exit");

        System.out.println("Please Select the Options");

        int input =scanner.nextInt();

        switch(input){
            case 1 :
                System.out.println("Please select the First Number");
                int x = scanner.nextInt();
                System.out.println("Please select the Second Number");
                int y = scanner.nextInt();
                int sum = x + y;
                System.out.println("Addition is : " +sum);
                break;
            case 2:
                System.out.println("Please select the First Number");
                int a  = scanner.nextInt();
                System.out.println("Please select the Second Number");
                int b = scanner.nextInt();
                int sub = a - b;
                System.out.println("Substraction is : " + sub);
                break;
            case 3:
                System.out.println("Please select the First Number");
                int c = scanner.nextInt();
                System.out.println("Please select the Second Number");
                int d = scanner.nextInt();
                int mul = c * d;
                System.out.println("Multiplication is :" + mul);
                break;
            case 4:
                System.out.println("Please select the First Number");
                int e = scanner.nextInt();
                System.out.println("Please select the Second Number");
                int f = scanner.nextInt();
                int div = e /f ;
                System.out.println("Divison is : " + div);
                break;
            case 5:
                System.out.println("Please select the First Number");
                int g = scanner.nextInt();
                System.out.println("Please select the Second Number");
                int h = scanner.nextInt();
                int mod = g % h;
                System.out.println("Modulus is : " + mod);
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
