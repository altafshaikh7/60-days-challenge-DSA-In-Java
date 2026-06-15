
import java.util.Scanner;

public class lecture_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x = scanner.nextInt();
        if (x >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor."); 
        }
    }
}