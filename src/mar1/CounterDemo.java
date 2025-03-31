package mar1;

public class CounterDemo {
    static int x = 10;
    CounterDemo(){
        System.out.println(x);
        x++;
    }


    public static void main(String[] args) {
        new CounterDemo();
        new CounterDemo();
        new CounterDemo();


    }
}
