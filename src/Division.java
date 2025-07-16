public class Division {
    public static double div(int a, int b) {
        System.out.print("Your answer is: ");
        if (b == 0) {
            System.out.println("You can't divide by zero.");
            return 0;
        }
        return (double) a / b;
    }
}
