import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Both numbers are equal.");
        } else if (a > b) {
            System.out.println("First number is greater than second number.");
        } else {

        }
    }

}
