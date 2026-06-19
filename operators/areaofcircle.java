package operators;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius: ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println("Area is " + a);

        // HomeWork
        double v = 3.8;
        double volume = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.println(volume);

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Number");

        int b = x.nextInt();
        int y = b * b;
        System.out.println("the square of the number is " + y);

    }
}
