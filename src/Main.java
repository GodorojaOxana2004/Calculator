import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int number1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();


        System.out.println("What operation you won?(+,-,*,/)");
        char simbol = sc.next().charAt(0);

        if (simbol == '+' || simbol == '-' || simbol == '*' || simbol == '/') {
            System.out.println("Start...");
        } else {
            System.out.println("No normal simbol");
        }
        switch (simbol) {
            case '+':
                System.out.println(Summation.sum(number1, number2));
                break;
            case '-':
                System.out.println(Minus.min(number1, number2));
                break;
            case '*':
                System.out.println(Multiplication.mult(number1, number2));
                break;
            case '/':
                System.out.println(Division.div(number1, number2));
                break;
            default:
                System.out.println("Invalid operation");
                break;

        }

    }
}
