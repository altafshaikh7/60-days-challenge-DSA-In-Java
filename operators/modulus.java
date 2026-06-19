package operators;

public class modulus {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = a % b;
        System.out.println(c);

        // properties of modulus
        // a%b = a (if a<b)
        // a%(-b) = a%b
        // -a % b = -(a%b)

        System.out.println((-39) % (-10));
    }
}
