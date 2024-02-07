import java.util.Scanner;

public class task_1 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers:");
        a = scan.nextInt();
        b = scan.nextInt();

        if (a > b) {
            System.out.println("Result: a > b");
        } else if (a < b) {
            System.out.println("Result: a < b");
        } else {
            System.out.println("Result: a = b");
        }

        System.out.println("Addition result: " + (a + b));
        System.out.println("Subtraction result: " + (a - b));
        System.out.println("Division result: " + (a / b));
        System.out.println("Multiplication result: " + (a * b));
    }
}