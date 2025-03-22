package feb15;

public class GradingSystem {
    public static void main(String[] args) {
        int grade = 59;
        if(grade > 90){
            System.out.println("You got A+ grade");
        } else if (grade >=80) {
            System.out.println("You got A grade");
        }else if(grade >=70){
            System.out.println("You got B+ grade");
        } else if (grade >=60) {
            System.out.println("You got C grade");
        } else if (grade >=50) {
            System.out.println("You got D grade");
        }else{
            System.out.println("You are fail");
        }
    }
}
