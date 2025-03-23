package feb18;
import java.util.Scanner;

public class PrintNnumbers {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please tell how many number you want to print");
        int x = scanner.nextInt();
        int y = 1 ;
        while(y <= x){
            System.out.println("X is : " + y);
            y++;
        }
    }
}
