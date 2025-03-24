package feb22;

import java.util.Scanner;
    public class MyCalculator {
        public static void main(String[] args) {
            System.out.println("*********");
            System.out.println("Welcome to my Calculator");
            System.out.println("*********");

            ArithmeticDemo ad =  new ArithmeticDemo();
            Scanner scanner = new Scanner(System.in);

            System.out.println("1.Additon");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");
            System.out.println("5.Modulus");
            System.out.println("6.Exit");

            System.out.println("Please Select the Options");

            int input =scanner.nextInt();
            ArithmeticDemo a = new ArithmeticDemo();

            switch(input){
                case 1 :
                    System.out.println("Please enter the first Number");
                    int num1 = scanner.nextInt();
                    System.out.println("Please enter the Second Number");
                    int num2 =scanner.nextInt();
                    System.out.println("Sum of both numbers is : ");
                    System.out.println(a.sum(num1, num2));
                    break;

                /*case 2:
                    System.out.println("Please enter the first Number");
                    int num1 = scanner.nextInt();
                    System.out.println("Please enter the Second Number");
                    int num2 =scanner.nextInt();
                    System.out.println("Sum of both numbers is : ");
                    System.out.println(a.sum(num1, num2));
                    break;
                case 3:
                    System.out.println("Please select the First Number");
                    int c = scanner.nextInt();
                    System.out.println("Please select the Second Number");
                    int d = scanner.nextInt();
                    int mul = c * d;
                    System.out.println("Multiplication is :" + mul);
                    break;
                case 4:
                    System.out.println("Please select the First Number");
                    int e = scanner.nextInt();
                    System.out.println("Please select the Second Number");
                    int f = scanner.nextInt();
                    int div = e /f ;
                    System.out.println("Divison is : " + div);
                    break;
                case 5:
                    System.out.println("Please select the First Number");
                    int g = scanner.nextInt();
                    System.out.println("Please select the Second Number");
                    int h = scanner.nextInt();
                    int mod = g % h;
                    System.out.println("Modulus is : " + mod);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;*/
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

