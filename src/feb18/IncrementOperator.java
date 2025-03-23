package feb18;

public class IncrementOperator {
    public static void main(String[] args) {
        int x = 1 ;
        System.out.println("X is :" + x);

        int y = x++;
        System.out.println("X is :" + x);
        System.out.println("Y is : " + y);

        int z = ++x;
        System.out.println("Z is :" + z);
    }
}
