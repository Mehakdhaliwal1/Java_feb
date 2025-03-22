package feb15;

public class LogicalOps {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 30;
        int b = 20;

        boolean result1 = (x > y) && (x == 10);
        boolean result2 = (a > y) || (x < a);
        boolean result3 = (x < y) && (x > b);
        boolean result4 = (x > y) || (y > a);
        boolean result5 = (a > y) && (y == 20);
        boolean result6 = (x >= 10) || (a == b);
        boolean result7 = (a > x) && (x <= 10);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
    }
}
