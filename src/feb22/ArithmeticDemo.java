package feb22;
import java.util.Scanner;
public class ArithmeticDemo {
    Scanner s = new Scanner(System.in);
    //Long method of sum
    /*public int sum(){
        System.out.println("please enter the first number");
        int a = s.nextInt();
        System.out.println("Please enter the Second number");
        int b = s.nextInt();

        System.out.println("Sum of both numbers is : " );
        return a + b;*/

    public int sum(int a ,int b){
        return a + b;
    }
    public int sub(int a ,int b){
        return a - b;
    }
    public int mul(int a ,int b){
        return a * b;
    }
    public int div(int a ,int b){
        return a / b;
    }
    public int mod(int a ,int b){
        return a % b;
    }

}
