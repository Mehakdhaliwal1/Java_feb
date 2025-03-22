package feb15;

public class LargestNumber {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        if(x > y && x >z){
            System.out.println("X is the largest number");
        } else if (y>z) {
            System.out.println("Y is the largest number");
        }else{
            System.out.println("Z is the largest number");
        }
    }
}
