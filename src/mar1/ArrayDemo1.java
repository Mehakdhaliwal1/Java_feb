package mar1;
import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] rollNo = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the elements of array");

        for(int i = 0 ; i < rollNo.length;i++){
            rollNo[i] = scanner.nextInt();
        }

        System.out.println("Print the elements of Array");

        for(int i = 0 ; i < rollNo.length;i++){
            System.out.println(rollNo[i]);
        }
    }

}
