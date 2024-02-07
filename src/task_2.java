import java.util.Scanner;

public class task_2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String a, b;
        System.out.println("Enter two strings:");
        a = scan.nextLine();
        b = scan.nextLine();

        if (a.equals(b)) {
            System.out.println("Strings are identical");
        } else {
            System.out.println("Strings aren't identical");
        }
    }
}