package feb22;
import java.util.Scanner;
public class OverloadMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Overloading o = new Overloading();

        System.out.println("Multiplication of three numbers : " + o.mul(2, 3, 5));
        System.out.println("Multiplication of two numbers : " + o.mul(2, 4));
        System.out.println("Multiplication of Four numbers : " + o.mul(4,5,6,7));


    }
}
