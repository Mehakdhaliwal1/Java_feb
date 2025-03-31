package mar4;

public class ArrayForEach {
    public static void main(String[] args) {
        int[][] arr = new int [2][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        for(int[] elements : arr){
            for(int numbers : elements){
                System.out.println(numbers);
            }
        }
    }
}
